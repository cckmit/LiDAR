package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@TableName("cbay_sys_payment_cfg")
public class CbaySysPaymentCfg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("\"COLL_ACCT_CD\"")
    private String collAcctCd;

    @TableField("\"COLL_ACCT_DESC\"")
    private String collAcctDesc;

    @TableField("\"SYS_IND\"")
    private String sysInd;

    @TableField("\"SAP_ACCOUNT_NBR\"")
    private String sapAccountNbr;

    @TableField("\"SAP_ACCOUNT_DESC\"")
    private String sapAccountDesc;

    @TableField("\"BANK_ID\"")
    private String bankId;

    @TableField("\"BRANCH_ID\"")
    private String branchId;

    @TableField("\"ACC_NBR\"")
    private String accNbr;

    @TableField("\"ACCOUNT_TYPE_CD\"")
    private String accountTypeCd;

    @TableField("\"ACCOUNT_TYPE_DESC\"")
    private String accountTypeDesc;

    @TableField("\"ACCOUNT_NM\"")
    private String accountNm;

    @TableField("\"VALID_IND\"")
    private String validInd;

    @TableField("\"CITY_CD\"")
    private String cityCd;

    @TableField("\"STATE_CD\"")
    private String stateCd;

    @TableField("\"BP_ID\"")
    private String bpId;

    @TableField("\"REF_OFC_ID\"")
    private String refOfcId;

    @TableField("\"CRCY_CD\"")
    private String crcyCd;

    @TableField("\"SWIFTCODE\"")
    private String swiftcode;

    @TableField("\"DEFAULT_IND\"")
    private String defaultInd;

    @TableField("\"ALIAS\"")
    private String alias;


    public String getCollAcctCd() {
        return collAcctCd;
    }

    public void setCollAcctCd(String collAcctCd) {
        this.collAcctCd = collAcctCd;
    }

    public String getCollAcctDesc() {
        return collAcctDesc;
    }

    public void setCollAcctDesc(String collAcctDesc) {
        this.collAcctDesc = collAcctDesc;
    }

    public String getSysInd() {
        return sysInd;
    }

    public void setSysInd(String sysInd) {
        this.sysInd = sysInd;
    }

    public String getSapAccountNbr() {
        return sapAccountNbr;
    }

    public void setSapAccountNbr(String sapAccountNbr) {
        this.sapAccountNbr = sapAccountNbr;
    }

    public String getSapAccountDesc() {
        return sapAccountDesc;
    }

    public void setSapAccountDesc(String sapAccountDesc) {
        this.sapAccountDesc = sapAccountDesc;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public String getAccountTypeCd() {
        return accountTypeCd;
    }

    public void setAccountTypeCd(String accountTypeCd) {
        this.accountTypeCd = accountTypeCd;
    }

    public String getAccountTypeDesc() {
        return accountTypeDesc;
    }

    public void setAccountTypeDesc(String accountTypeDesc) {
        this.accountTypeDesc = accountTypeDesc;
    }

    public String getAccountNm() {
        return accountNm;
    }

    public void setAccountNm(String accountNm) {
        this.accountNm = accountNm;
    }

    public String getValidInd() {
        return validInd;
    }

    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    public String getCityCd() {
        return cityCd;
    }

    public void setCityCd(String cityCd) {
        this.cityCd = cityCd;
    }

    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    public String getBpId() {
        return bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    public String getRefOfcId() {
        return refOfcId;
    }

    public void setRefOfcId(String refOfcId) {
        this.refOfcId = refOfcId;
    }

    public String getCrcyCd() {
        return crcyCd;
    }

    public void setCrcyCd(String crcyCd) {
        this.crcyCd = crcyCd;
    }

    public String getSwiftcode() {
        return swiftcode;
    }

    public void setSwiftcode(String swiftcode) {
        this.swiftcode = swiftcode;
    }

    public String getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(String defaultInd) {
        this.defaultInd = defaultInd;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "CbaySysPaymentCfg{" +
        "collAcctCd=" + collAcctCd +
        ", collAcctDesc=" + collAcctDesc +
        ", sysInd=" + sysInd +
        ", sapAccountNbr=" + sapAccountNbr +
        ", sapAccountDesc=" + sapAccountDesc +
        ", bankId=" + bankId +
        ", branchId=" + branchId +
        ", accNbr=" + accNbr +
        ", accountTypeCd=" + accountTypeCd +
        ", accountTypeDesc=" + accountTypeDesc +
        ", accountNm=" + accountNm +
        ", validInd=" + validInd +
        ", cityCd=" + cityCd +
        ", stateCd=" + stateCd +
        ", bpId=" + bpId +
        ", refOfcId=" + refOfcId +
        ", crcyCd=" + crcyCd +
        ", swiftcode=" + swiftcode +
        ", defaultInd=" + defaultInd +
        ", alias=" + alias +
        "}";
    }
}
