/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.sample.bindings;

public class ModelProtoQuery {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelProtoQuery(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelProtoQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_ModelProtoQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Blob signAndAddSignature(UnsignedQuery us, Keypair keypair) {
    return new Blob(irohaJNI.ModelProtoQuery_signAndAddSignature(swigCPtr, this, UnsignedQuery.getCPtr(us), us, Keypair.getCPtr(keypair), keypair), true);
  }

  public ModelProtoQuery() {
    this(irohaJNI.new_ModelProtoQuery(), true);
  }

}
