package com.example.binding;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class Role {
  public final static Role kAppendRole = new Role("kAppendRole");
  public final static Role kCreateRole = new Role("kCreateRole");
  public final static Role kDetachRole = new Role("kDetachRole");
  public final static Role kAddAssetQty = new Role("kAddAssetQty");
  public final static Role kSubtractAssetQty = new Role("kSubtractAssetQty");
  public final static Role kAddPeer = new Role("kAddPeer");
  public final static Role kAddSignatory = new Role("kAddSignatory");
  public final static Role kRemoveSignatory = new Role("kRemoveSignatory");
  public final static Role kSetQuorum = new Role("kSetQuorum");
  public final static Role kCreateAccount = new Role("kCreateAccount");
  public final static Role kSetDetail = new Role("kSetDetail");
  public final static Role kCreateAsset = new Role("kCreateAsset");
  public final static Role kTransfer = new Role("kTransfer");
  public final static Role kReceive = new Role("kReceive");
  public final static Role kCreateDomain = new Role("kCreateDomain");
  public final static Role kReadAssets = new Role("kReadAssets");
  public final static Role kGetRoles = new Role("kGetRoles");
  public final static Role kGetMyAccount = new Role("kGetMyAccount");
  public final static Role kGetAllAccounts = new Role("kGetAllAccounts");
  public final static Role kGetDomainAccounts = new Role("kGetDomainAccounts");
  public final static Role kGetMySignatories = new Role("kGetMySignatories");
  public final static Role kGetAllSignatories = new Role("kGetAllSignatories");
  public final static Role kGetDomainSignatories = new Role("kGetDomainSignatories");
  public final static Role kGetMyAccAst = new Role("kGetMyAccAst");
  public final static Role kGetAllAccAst = new Role("kGetAllAccAst");
  public final static Role kGetDomainAccAst = new Role("kGetDomainAccAst");
  public final static Role kGetMyAccDetail = new Role("kGetMyAccDetail");
  public final static Role kGetAllAccDetail = new Role("kGetAllAccDetail");
  public final static Role kGetDomainAccDetail = new Role("kGetDomainAccDetail");
  public final static Role kGetMyAccTxs = new Role("kGetMyAccTxs");
  public final static Role kGetAllAccTxs = new Role("kGetAllAccTxs");
  public final static Role kGetDomainAccTxs = new Role("kGetDomainAccTxs");
  public final static Role kGetMyAccAstTxs = new Role("kGetMyAccAstTxs");
  public final static Role kGetAllAccAstTxs = new Role("kGetAllAccAstTxs");
  public final static Role kGetDomainAccAstTxs = new Role("kGetDomainAccAstTxs");
  public final static Role kGetMyTxs = new Role("kGetMyTxs");
  public final static Role kGetAllTxs = new Role("kGetAllTxs");
  public final static Role kSetMyQuorum = new Role("kSetMyQuorum");
  public final static Role kAddMySignatory = new Role("kAddMySignatory");
  public final static Role kRemoveMySignatory = new Role("kRemoveMySignatory");
  public final static Role kTransferMyAssets = new Role("kTransferMyAssets");
  public final static Role kSetMyAccountDetail = new Role("kSetMyAccountDetail");
  public final static Role kGetBlocks = new Role("kGetBlocks");
  public final static Role COUNT = new Role("COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Role swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Role.class + " with value " + swigValue);
  }

  private Role(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Role(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Role(String swigName, Role swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Role[] swigValues = { kAppendRole, kCreateRole, kDetachRole, kAddAssetQty, kSubtractAssetQty, kAddPeer, kAddSignatory, kRemoveSignatory, kSetQuorum, kCreateAccount, kSetDetail, kCreateAsset, kTransfer, kReceive, kCreateDomain, kReadAssets, kGetRoles, kGetMyAccount, kGetAllAccounts, kGetDomainAccounts, kGetMySignatories, kGetAllSignatories, kGetDomainSignatories, kGetMyAccAst, kGetAllAccAst, kGetDomainAccAst, kGetMyAccDetail, kGetAllAccDetail, kGetDomainAccDetail, kGetMyAccTxs, kGetAllAccTxs, kGetDomainAccTxs, kGetMyAccAstTxs, kGetAllAccAstTxs, kGetDomainAccAstTxs, kGetMyTxs, kGetAllTxs, kSetMyQuorum, kAddMySignatory, kRemoveMySignatory, kTransferMyAssets, kSetMyAccountDetail, kGetBlocks, COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

