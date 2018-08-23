package com.example.binding;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Keypair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Keypair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Keypair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_Keypair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Keypair(PublicKey public_key, PrivateKey private_key) {
    this(irohaJNI.new_Keypair(PublicKey.getCPtr(public_key), public_key, PrivateKey.getCPtr(private_key), private_key), true);
  }

  public PublicKey publicKey() {
    return new PublicKey(irohaJNI.Keypair_publicKey(swigCPtr, this), false);
  }

  public PrivateKey privateKey() {
    return new PrivateKey(irohaJNI.Keypair_privateKey(swigCPtr, this), false);
  }

  public boolean kp_equal(Keypair keypair) {
    return irohaJNI.Keypair_kp_equal(swigCPtr, this, Keypair.getCPtr(keypair), keypair);
  }

  public String toString() {
    return irohaJNI.Keypair_toString(swigCPtr, this);
  }

}
