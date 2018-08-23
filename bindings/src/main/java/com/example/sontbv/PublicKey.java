/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PublicKey extends Blob {
  private transient long swigCPtr;

  protected PublicKey(long cPtr, boolean cMemoryOwn) {
    super(irohaJNI.PublicKey_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PublicKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_PublicKey(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PublicKey(String public_key) {
    this(irohaJNI.new_PublicKey__SWIG_0(public_key), true);
  }

  public PublicKey(Blob blob) {
    this(irohaJNI.new_PublicKey__SWIG_1(Blob.getCPtr(blob), blob), true);
  }

  public String toString() {
    return irohaJNI.PublicKey_toString(swigCPtr, this);
  }

}