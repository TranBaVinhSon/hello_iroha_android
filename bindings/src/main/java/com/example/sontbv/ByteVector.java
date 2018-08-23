/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ByteVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ByteVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ByteVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_ByteVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ByteVector() {
    this(irohaJNI.new_ByteVector__SWIG_0(), true);
  }

  public ByteVector(long n) {
    this(irohaJNI.new_ByteVector__SWIG_1(n), true);
  }

  public long size() {
    return irohaJNI.ByteVector_size(swigCPtr, this);
  }

  public long capacity() {
    return irohaJNI.ByteVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    irohaJNI.ByteVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return irohaJNI.ByteVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    irohaJNI.ByteVector_clear(swigCPtr, this);
  }

  public void add(short x) {
    irohaJNI.ByteVector_add(swigCPtr, this, x);
  }

  public short get(int i) {
    return irohaJNI.ByteVector_get(swigCPtr, this, i);
  }

  public void set(int i, short val) {
    irohaJNI.ByteVector_set(swigCPtr, this, i, val);
  }

}
