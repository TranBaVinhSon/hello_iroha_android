package com.example.sontbv.hello_iroha_sample;

import android.content.Context;
import android.util.Log;


import com.example.binding.ByteVector;
import com.example.binding.Keypair;
import com.example.binding.ModelCrypto;
import com.example.binding.ModelProtoTransaction;
import com.example.binding.ModelQueryBuilder;
import com.example.binding.ModelTransactionBuilder;
import com.example.binding.UnsignedTx;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.Single;
import iroha.protocol.CommandServiceGrpc;
import iroha.protocol.Endpoint;
import iroha.protocol.TransactionOuterClass;

import static com.example.sontbv.hello_iroha_sample.Constant.CREATOR;
import static com.example.sontbv.hello_iroha_sample.Constant.DOMAIN_ID;
import static com.example.sontbv.hello_iroha_sample.Constant.PRIV_KEY;
import static com.example.sontbv.hello_iroha_sample.Constant.PUB_KEY;


public class IrohaConnection {
    private final static String TAG = IrohaConnection.class.getSimpleName();
    private final ModelCrypto crypto = new ModelCrypto();
    private final ModelTransactionBuilder txBuilder = new ModelTransactionBuilder();
    private final ManagedChannel channel;
    private ModelQueryBuilder queryBuilder = new ModelQueryBuilder();

    public IrohaConnection(Context context){
        channel = ManagedChannelBuilder.forAddress(context.getString(R.string.iroha_url),
                context.getResources().getInteger(R.integer.iroha_port)).usePlaintext(true).build();

    }

    public Single<String> execute(String username, String details) {
        return Single.create(emitter -> {

            long currentTime = System.currentTimeMillis();
            Keypair userKeys = crypto.generateKeypair();
            Keypair adminKeys = crypto.convertFromExisting(PUB_KEY, PRIV_KEY);
            // Create account
            UnsignedTx createAccount = txBuilder.creatorAccountId(Constant.CREATOR)
                    .createdTime(BigInteger.valueOf(currentTime))
                    .createAccount(username, Constant.DOMAIN_ID, userKeys.publicKey())
                    .build();

            // sign transaction and get its binary representation (Blob)
            ByteVector txblob = new ModelProtoTransaction(createAccount).signAndAddSignature(adminKeys).finish().blob();

            // Convert ByteVector to byte array
            byte bs[] = toByteArray(txblob);

            // create proto object
            TransactionOuterClass.Transaction protoTx = null;
            try {
                Log.d(TAG, "success");
                protoTx = TransactionOuterClass.Transaction.parseFrom(bs);
                Log.d(TAG, protoTx.getPayload().getReducedPayload().getCreatorAccountId());
                Log.d(TAG, protoTx.getPayload().getReducedPayload().getCreatedTime() + "");
                Log.d(TAG, protoTx.getPayload().getReducedPayload().getQuorum() + "");
            } catch (InvalidProtocolBufferException e) {
                Log.d(TAG, "fail");
                emitter.onError(e);
            }

            // Send transaction to iroha
            CommandServiceGrpc.CommandServiceBlockingStub stub = CommandServiceGrpc.newBlockingStub(channel)
                    .withDeadlineAfter(20, TimeUnit.SECONDS);
            stub.torii(protoTx);
            Log.e(TAG, "1");
            // Check if it was successful
            if (!isTransactionSuccessful(stub, createAccount)) {
                Log.d(TAG, "Transaction failed");
                emitter.onError(new RuntimeException("Transaction failed"));
            }

            // GET ASSET INFO

//            long startQueryCounter = 1;
//            UnsignedQuery uquery = queryBuilder.creatorAccountId(CREATOR)
//                    .queryCounter(BigInteger.valueOf(startQueryCounter))
//                    .createdTime(BigInteger.valueOf(currentTime))
//                    .getAssetInfo("coin#test")
//                    .build();
//            ByteVector queryBlob = new ModelProtoQuery(uquery).signAndAddSignature(adminKeys).finish().blob();
//            byte bquery[] = toByteArray(queryBlob);
//
//            Queries.Query protoQuery = null;
//            try {
//                protoQuery = Queries.Query.parseFrom(bquery);
//            } catch (InvalidProtocolBufferException e) {
//                Log.e(TAG, "Exception while converting byte array to protobuf:" + e.getMessage());
//            }
//
//            QueryServiceGrpc.QueryServiceBlockingStub queryStub = QueryServiceGrpc.newBlockingStub(channel);
//            QryResponses.QueryResponse queryResponse = queryStub.find(protoQuery);
//
//            QryResponses.Asset asset = queryResponse.getAssetResponse().getAsset();
//
//            try {
//                Thread.sleep(5000);
//            }
//            catch(InterruptedException ex) {
//                Thread.currentThread().interrupt();
//            }
//
//            Log.d(TAG,"Asset Id = " + asset.getAssetId());
//            Log.d(TAG, "Precision = " + asset.getPrecision());
//            Log.d(TAG, queryResponse.getAccountDetailResponse().getDetail().toString() + "123");
        });
    }


    public static byte[] toByteArray(ByteVector blob) {
        byte bs[] = new byte[(int)blob.size()];
        for (int i = 0; i < blob.size(); ++i) {
            bs[i] = (byte)blob.get(i);
        }
        return bs;
    }

    private boolean isTransactionSuccessful(CommandServiceGrpc.CommandServiceBlockingStub stub, UnsignedTx utx){
        ByteVector txhash = utx.hash().blob();
        byte bshash[] = toByteArray(txhash);

        Endpoint.TxStatusRequest request = Endpoint.TxStatusRequest.newBuilder().setTxHash(ByteString.copyFrom(bshash)).build();

        Iterator<Endpoint.ToriiResponse> features = stub.statusStream(request);

        Endpoint.ToriiResponse response = null;
        while (features.hasNext()){
            response = features.next();
        }
        return response.getTxStatus() == Endpoint.TxStatus.COMMITTED;
    }

}
