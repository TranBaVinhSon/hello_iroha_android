/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.sample.bindings;

public class StringVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_StringVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringVector() {
    this(irohaJNI.new_StringVector__SWIG_0(), true);
  }

  public StringVector(long n) {
    this(irohaJNI.new_StringVector__SWIG_1(n), true);
  }

  public long size() {
    return irohaJNI.StringVector_size(swigCPtr, this);
  }

  public long capacity() {
    return irohaJNI.StringVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    irohaJNI.StringVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return irohaJNI.StringVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    irohaJNI.StringVector_clear(swigCPtr, this);
  }

  public void add(String x) {
    irohaJNI.StringVector_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return irohaJNI.StringVector_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    irohaJNI.StringVector_set(swigCPtr, this, i, val);
  }

}
