package com.example.binding;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class RolePermissionSet {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RolePermissionSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RolePermissionSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_RolePermissionSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RolePermissionSet() {
    this(irohaJNI.new_RolePermissionSet__SWIG_0(), true);
  }

  public RolePermissionSet(String bitstring) {
    this(irohaJNI.new_RolePermissionSet__SWIG_1(bitstring), true);
  }

  public String toBitstring() {
    return irohaJNI.RolePermissionSet_toBitstring(swigCPtr, this);
  }

  public static long size() {
    return irohaJNI.RolePermissionSet_size();
  }

  public RolePermissionSet reset() {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_reset(swigCPtr, this), false);
  }

  public RolePermissionSet set() {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_set__SWIG_0(swigCPtr, this), false);
  }

  public RolePermissionSet set(Role p) {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_set__SWIG_1(swigCPtr, this, p.swigValue()), false);
  }

  public RolePermissionSet unset(Role p) {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_unset(swigCPtr, this, p.swigValue()), false);
  }

  public boolean test(Role p) {
    return irohaJNI.RolePermissionSet_test(swigCPtr, this, p.swigValue());
  }

  public boolean none() {
    return irohaJNI.RolePermissionSet_none(swigCPtr, this);
  }

  public boolean isSubsetOf(RolePermissionSet r) {
    return irohaJNI.RolePermissionSet_isSubsetOf(swigCPtr, this, RolePermissionSet.getCPtr(r), r);
  }

  public boolean equal(RolePermissionSet r) {
    return irohaJNI.RolePermissionSet_equal(swigCPtr, this, RolePermissionSet.getCPtr(r), r);
  }

  public boolean not_equal(RolePermissionSet r) {
    return irohaJNI.RolePermissionSet_not_equal(swigCPtr, this, RolePermissionSet.getCPtr(r), r);
  }

  public RolePermissionSet bset_and(RolePermissionSet r) {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_bset_and(swigCPtr, this, RolePermissionSet.getCPtr(r), r), false);
  }

  public RolePermissionSet bset_or(RolePermissionSet r) {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_bset_or(swigCPtr, this, RolePermissionSet.getCPtr(r), r), false);
  }

  public RolePermissionSet bset_xor(RolePermissionSet r) {
    return new RolePermissionSet(irohaJNI.RolePermissionSet_bset_xor(swigCPtr, this, RolePermissionSet.getCPtr(r), r), false);
  }

  public void iterate(SWIGTYPE_p_std__functionT_void_fshared_model__interface__permissions__RoleF_t f) {
    irohaJNI.RolePermissionSet_iterate(swigCPtr, this, SWIGTYPE_p_std__functionT_void_fshared_model__interface__permissions__RoleF_t.getCPtr(f));
  }

  public RolePermissionSet(IntVector perms) {
    this(irohaJNI.new_RolePermissionSet__SWIG_2(IntVector.getCPtr(perms), perms), true);
  }

}
