/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.sample.bindings;

public class ModelQueryBuilder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelQueryBuilder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelQueryBuilder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_ModelQueryBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModelQueryBuilder() {
    this(irohaJNI.new_ModelQueryBuilder(), true);
  }

  public ModelQueryBuilder createdTime(java.math.BigInteger created_time) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_createdTime(swigCPtr, this, created_time), true);
  }

  public ModelQueryBuilder creatorAccountId(String creator_account_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_creatorAccountId(swigCPtr, this, creator_account_id), true);
  }

  public ModelQueryBuilder queryCounter(java.math.BigInteger query_counter) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_queryCounter(swigCPtr, this, query_counter), true);
  }

  public ModelQueryBuilder getAccount(String account_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getAccount(swigCPtr, this, account_id), true);
  }

  public ModelQueryBuilder getSignatories(String account_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getSignatories(swigCPtr, this, account_id), true);
  }

  public ModelQueryBuilder getAccountTransactions(String account_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getAccountTransactions(swigCPtr, this, account_id), true);
  }

  public ModelQueryBuilder getAccountAssetTransactions(String account_id, String asset_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getAccountAssetTransactions(swigCPtr, this, account_id, asset_id), true);
  }

  public ModelQueryBuilder getAccountAssets(String account_id, String asset_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getAccountAssets(swigCPtr, this, account_id, asset_id), true);
  }

  public ModelQueryBuilder getRoles() {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getRoles(swigCPtr, this), true);
  }

  public ModelQueryBuilder getAssetInfo(String asset_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getAssetInfo(swigCPtr, this, asset_id), true);
  }

  public ModelQueryBuilder getRolePermissions(String role_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getRolePermissions(swigCPtr, this, role_id), true);
  }

  public ModelQueryBuilder getTransactions(HashVector hashes) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getTransactions(swigCPtr, this, HashVector.getCPtr(hashes), hashes), true);
  }

  public ModelQueryBuilder getAccountDetail(String account_id) {
    return new ModelQueryBuilder(irohaJNI.ModelQueryBuilder_getAccountDetail(swigCPtr, this, account_id), true);
  }

  public UnsignedQuery build() {
    return new UnsignedQuery(irohaJNI.ModelQueryBuilder_build(swigCPtr, this), true);
  }

}
