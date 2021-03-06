package com.example.binding;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class HashVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HashVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HashVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_HashVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HashVector() {
    this(irohaJNI.new_HashVector(), true);
  }

  public long size() {
    return irohaJNI.HashVector_size(swigCPtr, this);
  }

  public long capacity() {
    return irohaJNI.HashVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    irohaJNI.HashVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return irohaJNI.HashVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    irohaJNI.HashVector_clear(swigCPtr, this);
  }

  public void add(Hash x) {
    irohaJNI.HashVector_add(swigCPtr, this, Hash.getCPtr(x), x);
  }

  public Hash get(int i) {
    return new Hash(irohaJNI.HashVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, Hash val) {
    irohaJNI.HashVector_set(swigCPtr, this, i, Hash.getCPtr(val), val);
  }

}
