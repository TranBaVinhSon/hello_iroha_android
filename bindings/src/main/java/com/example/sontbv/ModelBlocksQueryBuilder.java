/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ModelBlocksQueryBuilder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelBlocksQueryBuilder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelBlocksQueryBuilder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_ModelBlocksQueryBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModelBlocksQueryBuilder() {
    this(irohaJNI.new_ModelBlocksQueryBuilder(), true);
  }

  public ModelBlocksQueryBuilder createdTime(java.math.BigInteger created_time) {
    return new ModelBlocksQueryBuilder(irohaJNI.ModelBlocksQueryBuilder_createdTime(swigCPtr, this, created_time), true);
  }

  public ModelBlocksQueryBuilder creatorAccountId(String creator_account_id) {
    return new ModelBlocksQueryBuilder(irohaJNI.ModelBlocksQueryBuilder_creatorAccountId(swigCPtr, this, creator_account_id), true);
  }

  public ModelBlocksQueryBuilder queryCounter(java.math.BigInteger query_counter) {
    return new ModelBlocksQueryBuilder(irohaJNI.ModelBlocksQueryBuilder_queryCounter(swigCPtr, this, query_counter), true);
  }

  public UnsignedBlockQuery build() {
    return new UnsignedBlockQuery(irohaJNI.ModelBlocksQueryBuilder_build(swigCPtr, this), true);
  }

}