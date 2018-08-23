/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class BlocksQuery {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BlocksQuery(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlocksQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_BlocksQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BlocksQuery(BlocksQuery o) {
    this(irohaJNI.new_BlocksQuery__SWIG_1(BlocksQuery.getCPtr(o), o), true);
  }

  public String creatorAccountId() {
    return irohaJNI.BlocksQuery_creatorAccountId(swigCPtr, this);
  }

  public java.math.BigInteger queryCounter() {
    return irohaJNI.BlocksQuery_queryCounter(swigCPtr, this);
  }

  public Blob blob() {
    return new Blob(irohaJNI.BlocksQuery_blob(swigCPtr, this), false);
  }

  public Blob payload() {
    return new Blob(irohaJNI.BlocksQuery_payload(swigCPtr, this), false);
  }

  public boolean addSignature(Signed signed_blob, PublicKey public_key) {
    return irohaJNI.BlocksQuery_addSignature(swigCPtr, this, Signed.getCPtr(signed_blob), signed_blob, PublicKey.getCPtr(public_key), public_key);
  }

  public java.math.BigInteger createdTime() {
    return irohaJNI.BlocksQuery_createdTime(swigCPtr, this);
  }

  public SignatureVector signs() {
    return new SignatureVector(irohaJNI.BlocksQuery_signs(swigCPtr, this), true);
  }

}