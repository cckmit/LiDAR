package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 合作伙伴账户信息
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@TableName("cbay_bp_biz_ptnr_acct_info")
public class CbayBpBizPtnrAcctInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合作伙伴账户信息ID
     */
    @TableId("\"BP_BANK_ACCT_ID\"")
    private String bpBankAcctId;

    /**
     * 合作伙伴ID
     */
    @TableField("\"BP_ID\"")
    @NotBlank(message = "合作伙伴不能为空")
    private String bpId;

    /**
     *银行代码
     */
    @TableField("\"BANK_CD\"")
    private String bankCd;

    /**
     *开户行名称
     */
    @TableField("\"BANK_NM\"")
    @NotBlank(message = "开户行名称不能为空")
    private String bankNm;

    /**
     *开户行分支行名称
     */
    @TableField("\"BANK_BRCH_NM\"")
    @NotBlank(message = "开户行分支行名称不能为空")
    private String bankBrchNm;

    /**
     *银行账户类别
     */
    @TableField("\"BANK_ACCT_TYPE_CD\"")
    @NotBlank(message = "银行账户类别不能为空")
    private String bankAcctTypeCd;

    /**
     * 银行账户户名
     */
    @TableField("\"BANK_ACCT_NM\"")
    private String bankAcctNm;

    /**
     *银行账户账号
     */
    @TableField("\"BANK_ACCT_NBR\"")
    @NotBlank(message = "银行账户账号不能为空")
    private String bankAcctNbr;

    /**
     *银行账户状态
     */
    @TableField("\"BANK_ACCT_STAT_CD\"")
    private String bankAcctStatCd;

    /**
     *银行账户用途
     */
    @TableField("\"BANK_ACCT_PRPS_CD\"")
    private String bankAcctPrpsCd;

    /**
     * 放款缺省账户标识
     */
    @TableField("\"TRANCHE_ACCT_IND\"")
    private String trancheAcctInd;

    /**
     *扣款缺省账户标识
     */
    @TableField("\"DRAW_ACCT_IND\"")
    private String drawAcctInd;

    /**
     *备注
     */
    @TableField("\"REMARK\"")
    private String remark;

    /**
     *创建时间
     */
    @TableField("\"CREAT_TIME\"")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDateTime creatTime;

    /**
     *贷款银行
     */
    @TableField("\"LOAN_BANK\"")
    private String loanBank;

    /**
     *授信银行
     */
    @TableField("\"CREDIT_BANK\"")
    private String creditBank;

    /**
     * 是否自动划扣账户
     */
    @TableField("\"AUTO_DEDUCTION_IND\"")
    private String autoDeductionInd;

    /**
     * 验证状态
     */
    @TableField("\"VERIFY_STATE_CD\"")
    private String verifyStateCd;

    /**
     * 最新申请批次号
     */
    @TableField("\"APPL_NBR\"")
    private String applNbr;

    /**
     * 默认划扣账户
     */
    @TableField("\"DEF_ACCT_IND\"")
    private String defAcctInd;

    /**
     * 授权起始日（自动核销）
     */
    @TableField("\"AUTH_START_DATE\"")
    private LocalDateTime authStartDate;

    /**
     * 授权截止日（自动核销）
     */
    @TableField("\"AUTH_END_DATE\"")
    private LocalDateTime authEndDate;

    /**
     * 授权更新状态
     */
    @TableField("\"AUTH_UPDATE_STATUS\"")
    private String authUpdateStatus;

    /**
     * 账户状态
     */
    @TableField("\"ACCT_STATUS\"")
    private String acctStatus;

    /**
     * 收付通协议编号
     */
    @TableField("\"PROTOCOL_ID\"")
    private String protocolId;


    public String getBpBankAcctId() {
        return bpBankAcctId;
    }

    public void setBpBankAcctId(String bpBankAcctId) {
        this.bpBankAcctId = bpBankAcctId;
    }

    public String getBpId() {
        return bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    public String getBankCd() {
        return bankCd;
    }

    public void setBankCd(String bankCd) {
        this.bankCd = bankCd;
    }

    public String getBankNm() {
        return bankNm;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm;
    }

    public String getBankBrchNm() {
        return bankBrchNm;
    }

    public void setBankBrchNm(String bankBrchNm) {
        this.bankBrchNm = bankBrchNm;
    }

    public String getBankAcctTypeCd() {
        return bankAcctTypeCd;
    }

    public void setBankAcctTypeCd(String bankAcctTypeCd) {
        this.bankAcctTypeCd = bankAcctTypeCd;
    }

    public String getBankAcctNm() {
        return bankAcctNm;
    }

    public void setBankAcctNm(String bankAcctNm) {
        this.bankAcctNm = bankAcctNm;
    }

    public String getBankAcctNbr() {
        return bankAcctNbr;
    }

    public void setBankAcctNbr(String bankAcctNbr) {
        this.bankAcctNbr = bankAcctNbr;
    }

    public String getBankAcctStatCd() {
        return bankAcctStatCd;
    }

    public void setBankAcctStatCd(String bankAcctStatCd) {
        this.bankAcctStatCd = bankAcctStatCd;
    }

    public String getBankAcctPrpsCd() {
        return bankAcctPrpsCd;
    }

    public void setBankAcctPrpsCd(String bankAcctPrpsCd) {
        this.bankAcctPrpsCd = bankAcctPrpsCd;
    }

    public String getTrancheAcctInd() {
        return trancheAcctInd;
    }

    public void setTrancheAcctInd(String trancheAcctInd) {
        this.trancheAcctInd = trancheAcctInd;
    }

    public String getDrawAcctInd() {
        return drawAcctInd;
    }

    public void setDrawAcctInd(String drawAcctInd) {
        this.drawAcctInd = drawAcctInd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    public String getLoanBank() {
        return loanBank;
    }

    public void setLoanBank(String loanBank) {
        this.loanBank = loanBank;
    }

    public String getCreditBank() {
        return creditBank;
    }

    public void setCreditBank(String creditBank) {
        this.creditBank = creditBank;
    }

    public String getAutoDeductionInd() {
        return autoDeductionInd;
    }

    public void setAutoDeductionInd(String autoDeductionInd) {
        this.autoDeductionInd = autoDeductionInd;
    }

    public String getVerifyStateCd() {
        return verifyStateCd;
    }

    public void setVerifyStateCd(String verifyStateCd) {
        this.verifyStateCd = verifyStateCd;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getDefAcctInd() {
        return defAcctInd;
    }

    public void setDefAcctInd(String defAcctInd) {
        this.defAcctInd = defAcctInd;
    }

    public LocalDateTime getAuthStartDate() {
        return authStartDate;
    }

    public void setAuthStartDate(LocalDateTime authStartDate) {
        this.authStartDate = authStartDate;
    }

    public LocalDateTime getAuthEndDate() {
        return authEndDate;
    }

    public void setAuthEndDate(LocalDateTime authEndDate) {
        this.authEndDate = authEndDate;
    }

    public String getAuthUpdateStatus() {
        return authUpdateStatus;
    }

    public void setAuthUpdateStatus(String authUpdateStatus) {
        this.authUpdateStatus = authUpdateStatus;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    @Override
    public String toString() {
        return "CbayBpBizPtnrAcctInfo{" +
        "bpBankAcctId=" + bpBankAcctId +
        ", bpId=" + bpId +
        ", bankCd=" + bankCd +
        ", bankNm=" + bankNm +
        ", bankBrchNm=" + bankBrchNm +
        ", bankAcctTypeCd=" + bankAcctTypeCd +
        ", bankAcctNm=" + bankAcctNm +
        ", bankAcctNbr=" + bankAcctNbr +
        ", bankAcctStatCd=" + bankAcctStatCd +
        ", bankAcctPrpsCd=" + bankAcctPrpsCd +
        ", trancheAcctInd=" + trancheAcctInd +
        ", drawAcctInd=" + drawAcctInd +
        ", remark=" + remark +
        ", creatTime=" + creatTime +
        ", loanBank=" + loanBank +
        ", creditBank=" + creditBank +
        ", autoDeductionInd=" + autoDeductionInd +
        ", verifyStateCd=" + verifyStateCd +
        ", applNbr=" + applNbr +
        ", defAcctInd=" + defAcctInd +
        ", authStartDate=" + authStartDate +
        ", authEndDate=" + authEndDate +
        ", authUpdateStatus=" + authUpdateStatus +
        ", acctStatus=" + acctStatus +
        ", protocolId=" + protocolId +
        "}";
    }
}
