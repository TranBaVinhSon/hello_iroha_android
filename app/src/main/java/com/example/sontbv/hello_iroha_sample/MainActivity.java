package com.example.sontbv.hello_iroha_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.widget.RxTextView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    static {
        try {
            System.loadLibrary("irohajava");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private IrohaConnection irohaConnection;
    private Button button;
    private EditText username;
    private EditText details;
    private TextView getUserDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        irohaConnection = new IrohaConnection(this);
        button = findViewById(R.id.send_details);
        username = findViewById(R.id.username);
        details = findViewById(R.id.details);
        getUserDetails = findViewById(R.id.get_user_details);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irohaConnection.execute(username.getText().toString(),
                        details.getText().toString())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(result -> {
                            getUserDetails.setText("Success! Result is " + result);
                        }, throwable -> {
                            getUserDetails.setText("Error " + throwable.getMessage());
                        });
            }
        });
    }
}
