package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <p>
 * 采购款附加明细表
 * </p>
 *
 * @author LQ
 * @since 2022-06-14
 */
@TableName("ol_purch_payment_extra")
public class OlPurchPaymentExtra implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("\"SEQNO\"")
    private String seqno;

    @TableField("\"CONTRACT_ID\"")
    private String contractId;

    @TableField("\"EXTERNAL_CONTRACT_NBR\"")
    private String externalContractNbr;

    @TableField("\"CONTRACT_SEQNO\"")
    private String contractSeqno;

    @TableField("\"APPLY_SEQNO\"")
    private String applySeqno;

    @TableField("\"TRANS_SEQNO\"")
    private String transSeqno;

    @TableField("\"PAYMENT_TRANS_SEQNO\"")
    private String paymentTransSeqno;

    /**
     * 收/付
     */
    @TableField("\"RECEIVE_PAY_DIR\"")
    private String receivePayDir;

    @TableField("\"RECEIVE_PAY_DESC\"")
    private String receivePayDesc;

    /**
     * 合并至投放款/合并至费用支出/合并至租金收入
     */
    @TableField("\"VOUCHER_PROCESS\"")
    private String voucherProcess;

    @TableField("\"AMT\"")
    private BigDecimal amt;

    @TableField("\"CURRENCY_CDE\"")
    private String currencyCde;

    @TableField("\"MEMO\"")
    private String memo;

    @TableField("\"PAYMENT_ON_CREDIT_SEQNO\"")
    private String paymentOnCreditSeqno;

    @TableField("\"VAT_AMT\"")
    private BigDecimal vatAmt;

    @TableField("\"VAT_RATE\"")
    private String vatRate;

    @TableField("\"IS_ACCRUED\"")
    private String isAccrued;

    /**
     * 摊销起始日
     */
    @TableField("\"ACCRUED_START_DATE\"")
    @DateTimeFormat(pattern = "yyyy-MM-dd\"")
    private LocalDate accruedStartDate;

    /**
     * 摊销结束日
     */
    @TableField("\"ACCRUED_END_DATE\"")
    @DateTimeFormat(pattern = "yyyy-MM-dd\"")
    private LocalDate accruedEndDate;

    @TableField("\"ASSET_INFO_ADD_SEQNO\"")
    private String assetInfoAddSeqno;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getExternalContractNbr() {
        return externalContractNbr;
    }

    public void setExternalContractNbr(String externalContractNbr) {
        this.externalContractNbr = externalContractNbr;
    }

    public String getContractSeqno() {
        return contractSeqno;
    }

    public void setContractSeqno(String contractSeqno) {
        this.contractSeqno = contractSeqno;
    }

    public String getApplySeqno() {
        return applySeqno;
    }

    public void setApplySeqno(String applySeqno) {
        this.applySeqno = applySeqno;
    }

    public String getTransSeqno() {
        return transSeqno;
    }

    public void setTransSeqno(String transSeqno) {
        this.transSeqno = transSeqno;
    }

    public String getPaymentTransSeqno() {
        return paymentTransSeqno;
    }

    public void setPaymentTransSeqno(String paymentTransSeqno) {
        this.paymentTransSeqno = paymentTransSeqno;
    }

    public String getReceivePayDir() {
        return receivePayDir;
    }

    public void setReceivePayDir(String receivePayDir) {
        this.receivePayDir = receivePayDir;
    }

    public String getReceivePayDesc() {
        return receivePayDesc;
    }

    public void setReceivePayDesc(String receivePayDesc) {
        this.receivePayDesc = receivePayDesc;
    }

    public String getVoucherProcess() {
        return voucherProcess;
    }

    public void setVoucherProcess(String voucherProcess) {
        this.voucherProcess = voucherProcess;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getCurrencyCde() {
        return currencyCde;
    }

    public void setCurrencyCde(String currencyCde) {
        this.currencyCde = currencyCde;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPaymentOnCreditSeqno() {
        return paymentOnCreditSeqno;
    }

    public void setPaymentOnCreditSeqno(String paymentOnCreditSeqno) {
        this.paymentOnCreditSeqno = paymentOnCreditSeqno;
    }

    public BigDecimal getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(BigDecimal vatAmt) {
        this.vatAmt = vatAmt;
    }

    public String getVatRate() {
        return vatRate;
    }

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
    }

    public String getIsAccrued() {
        return isAccrued;
    }

    public void setIsAccrued(String isAccrued) {
        this.isAccrued = isAccrued;
    }

    public LocalDate getAccruedStartDate() {
        return accruedStartDate;
    }

    public void setAccruedStartDate(LocalDate accruedStartDate) {
        this.accruedStartDate = accruedStartDate;
    }

    public LocalDate getAccruedEndDate() {
        return accruedEndDate;
    }

    public void setAccruedEndDate(LocalDate accruedEndDate) {
        this.accruedEndDate = accruedEndDate;
    }

    public String getAssetInfoAddSeqno() {
        return assetInfoAddSeqno;
    }

    public void setAssetInfoAddSeqno(String assetInfoAddSeqno) {
        this.assetInfoAddSeqno = assetInfoAddSeqno;
    }

    @Override
    public String toString() {
        return "OlPurchPaymentExtra{" +
                "seqno=" + seqno +
                ", contractId=" + contractId +
                ", externalContractNbr=" + externalContractNbr +
                ", contractSeqno=" + contractSeqno +
                ", applySeqno=" + applySeqno +
                ", transSeqno=" + transSeqno +
                ", paymentTransSeqno=" + paymentTransSeqno +
                ", receivePayDir=" + receivePayDir +
                ", receivePayDesc=" + receivePayDesc +
                ", voucherProcess=" + voucherProcess +
                ", amt=" + amt +
                ", currencyCde=" + currencyCde +
                ", memo=" + memo +
                ", paymentOnCreditSeqno=" + paymentOnCreditSeqno +
                ", vatAmt=" + vatAmt +
                ", vatRate=" + vatRate +
                ", isAccrued=" + isAccrued +
                ", accruedStartDate=" + accruedStartDate +
                ", accruedEndDate=" + accruedEndDate +
                ", assetInfoAddSeqno=" + assetInfoAddSeqno +
                "}";
    }
}
