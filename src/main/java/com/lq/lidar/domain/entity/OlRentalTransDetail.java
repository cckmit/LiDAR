package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 交易明细表
 * </p>
 *
 * @author LQ
 * @since 2022-07-25
 */
@TableName("ol_rental_trans_detail")
public class OlRentalTransDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，没有业务含义，系统自动生成
     */
    @TableId("SEQNO")
    private String seqno;

    /**
     * 与租赁合同表主键关联
     */
    @TableField("CONTRACT_SEQNO")
    private String contractSeqno;

    /**
     * 与租赁合同表合同号关联
     */
    @TableField("EXTERNAL_CONTRACT_NBR")
    private String externalContractNbr;

    /**
     * 合同ID
     */
    @TableField("CONTRACT_ID")
    private String contractId;

    /**
     * 交易主体ID
     */
    @TableField("TRANS_SPV_ID")
    private String transSpvId;

    /**
     * 交易主体名称
     */
    @TableField("TRANS_SPV_NAME")
    private String transSpvName;

    /**
     * 交易日期
     */
    @TableField("TRANS_DATE")
    private LocalDateTime transDate;

    /**
     * 收到银行汇款/退不明款项（待清算款项）/退多收款/收取保证金/保证金退款/收到租金还款/收到罚息/收到维修储备金/支付维修储备金/提前终止/冲账
     */
    @TableField("TRANS_TYPE")
    private String transType;

    /**
     * 交易金额
     */
    @TableField("TRANS_AMT")
    private BigDecimal transAmt;

    /**
     * 存出资金账号
     */
    @TableField("ACCTNO_OUT")
    private String acctnoOut;

    /**
     * 存出资金账户币种
     */
    @TableField("ACCTNO_OUT_CURRENCY")
    private String acctnoOutCurrency;

    /**
     * 存入资金账号
     */
    @TableField("ACCTNO_IN")
    private String acctnoIn;

    /**
     * 存入资金账户币种
     */
    @TableField("ACCTNO_IN_CURRENCY")
    private String acctnoInCurrency;

    /**
     * 交易币种
     */
    @TableField("CURRENCY_TRANS")
    private String currencyTrans;

    /**
     * 本位币种
     */
    @TableField("CURRENCY_STANDARD")
    private String currencyStandard;

    /**
     * 报告币种
     */
    @TableField("CURRENCY_REPORT")
    private String currencyReport;

    /**
     * 折人民币汇率
     */
    @TableField("EXCH_RTE_RMB")
    private BigDecimal exchRteRmb;

    /**
     * 折本币汇率
     */
    @TableField("EXCH_RTE_STANDARD")
    private BigDecimal exchRteStandard;

    /**
     * 折报告币汇率
     */
    @TableField("EXCH_RTE_REPORT")
    private BigDecimal exchRteReport;

    /**
     * 折存出账户汇率
     */
    @TableField("EXCH_RTE_ACCT_OUT")
    private BigDecimal exchRteAcctOut;

    /**
     * 折存入账户汇率
     */
    @TableField("EXCH_RTE_ACCT_IN")
    private BigDecimal exchRteAcctIn;

    /**
     * 冲账前交易明细主键
     */
    @TableField("SEQNO_BEFORE_REVERSE")
    private String seqnoBeforeReverse;

    /**
     * 产生的会计分录ID
     */
    @TableField("VOUCHER_ID")
    private String voucherId;

    /**
     * 未记账/处理中/记账成功/记账失败
     */
    @TableField("VOUCHER_STATUS")
    private String voucherStatus;

    /**
     * 核销主键
     */
    @TableField("WRITE_OFF_SEQNO")
    private String writeOffSeqno;

    /**
     * 保证金信息主键
     */
    @TableField("CASH_DEPOSIT_SEQNO")
    private String cashDepositSeqno;

    /**
     * 费用信息主键
     */
    @TableField("FEE_INFO_SEQNO")
    private String feeInfoSeqno;

    /**
     * 维修储备金信息主键
     */
    @TableField("MAINTEN_FUND_SEQNO")
    private String maintenFundSeqno;

    /**
     * 收款计划主键
     */
    @TableField("RECEIVE_PLAN_SEQNO")
    private String receivePlanSeqno;

    /**
     * 备注
     */
    @TableField("MEMO")
    private String memo;

    /**
     * 收款单主键
     */
    @TableField("RECEIPT_VOUCHER_SEQNO")
    private String receiptVoucherSeqno;

    /**
     * 增值税金额
     */
    @TableField("VAT_AMT")
    private BigDecimal vatAmt;

    /**
     * 增值税币种
     */
    @TableField("VAT_CURRENCY_CDE")
    private String vatCurrencyCde;

    /**
     * 收款单实收金额
     */
    @TableField("RECEIPT_VOUCHER_ACT_AMT")
    private BigDecimal receiptVoucherActAmt;

    /**
     * 冲账前的voucher_id
     */
    @TableField("VAT_ORIG_RECEIVE_PLAN_SEQNO")
    private String vatOrigReceivePlanSeqno;

    /**
     * 其他交易明细主键
     */
    @TableField("OTHER_BUSI_SEQNO")
    private String otherBusiSeqno;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getContractSeqno() {
        return contractSeqno;
    }

    public void setContractSeqno(String contractSeqno) {
        this.contractSeqno = contractSeqno;
    }

    public String getExternalContractNbr() {
        return externalContractNbr;
    }

    public void setExternalContractNbr(String externalContractNbr) {
        this.externalContractNbr = externalContractNbr;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getTransSpvId() {
        return transSpvId;
    }

    public void setTransSpvId(String transSpvId) {
        this.transSpvId = transSpvId;
    }

    public String getTransSpvName() {
        return transSpvName;
    }

    public void setTransSpvName(String transSpvName) {
        this.transSpvName = transSpvName;
    }

    public LocalDateTime getTransDate() {
        return transDate;
    }

    public void setTransDate(LocalDateTime transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public String getAcctnoOut() {
        return acctnoOut;
    }

    public void setAcctnoOut(String acctnoOut) {
        this.acctnoOut = acctnoOut;
    }

    public String getAcctnoOutCurrency() {
        return acctnoOutCurrency;
    }

    public void setAcctnoOutCurrency(String acctnoOutCurrency) {
        this.acctnoOutCurrency = acctnoOutCurrency;
    }

    public String getAcctnoIn() {
        return acctnoIn;
    }

    public void setAcctnoIn(String acctnoIn) {
        this.acctnoIn = acctnoIn;
    }

    public String getAcctnoInCurrency() {
        return acctnoInCurrency;
    }

    public void setAcctnoInCurrency(String acctnoInCurrency) {
        this.acctnoInCurrency = acctnoInCurrency;
    }

    public String getCurrencyTrans() {
        return currencyTrans;
    }

    public void setCurrencyTrans(String currencyTrans) {
        this.currencyTrans = currencyTrans;
    }

    public String getCurrencyStandard() {
        return currencyStandard;
    }

    public void setCurrencyStandard(String currencyStandard) {
        this.currencyStandard = currencyStandard;
    }

    public String getCurrencyReport() {
        return currencyReport;
    }

    public void setCurrencyReport(String currencyReport) {
        this.currencyReport = currencyReport;
    }

    public BigDecimal getExchRteRmb() {
        return exchRteRmb;
    }

    public void setExchRteRmb(BigDecimal exchRteRmb) {
        this.exchRteRmb = exchRteRmb;
    }

    public BigDecimal getExchRteStandard() {
        return exchRteStandard;
    }

    public void setExchRteStandard(BigDecimal exchRteStandard) {
        this.exchRteStandard = exchRteStandard;
    }

    public BigDecimal getExchRteReport() {
        return exchRteReport;
    }

    public void setExchRteReport(BigDecimal exchRteReport) {
        this.exchRteReport = exchRteReport;
    }

    public BigDecimal getExchRteAcctOut() {
        return exchRteAcctOut;
    }

    public void setExchRteAcctOut(BigDecimal exchRteAcctOut) {
        this.exchRteAcctOut = exchRteAcctOut;
    }

    public BigDecimal getExchRteAcctIn() {
        return exchRteAcctIn;
    }

    public void setExchRteAcctIn(BigDecimal exchRteAcctIn) {
        this.exchRteAcctIn = exchRteAcctIn;
    }

    public String getSeqnoBeforeReverse() {
        return seqnoBeforeReverse;
    }

    public void setSeqnoBeforeReverse(String seqnoBeforeReverse) {
        this.seqnoBeforeReverse = seqnoBeforeReverse;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(String voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public String getWriteOffSeqno() {
        return writeOffSeqno;
    }

    public void setWriteOffSeqno(String writeOffSeqno) {
        this.writeOffSeqno = writeOffSeqno;
    }

    public String getCashDepositSeqno() {
        return cashDepositSeqno;
    }

    public void setCashDepositSeqno(String cashDepositSeqno) {
        this.cashDepositSeqno = cashDepositSeqno;
    }

    public String getFeeInfoSeqno() {
        return feeInfoSeqno;
    }

    public void setFeeInfoSeqno(String feeInfoSeqno) {
        this.feeInfoSeqno = feeInfoSeqno;
    }

    public String getMaintenFundSeqno() {
        return maintenFundSeqno;
    }

    public void setMaintenFundSeqno(String maintenFundSeqno) {
        this.maintenFundSeqno = maintenFundSeqno;
    }

    public String getReceivePlanSeqno() {
        return receivePlanSeqno;
    }

    public void setReceivePlanSeqno(String receivePlanSeqno) {
        this.receivePlanSeqno = receivePlanSeqno;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReceiptVoucherSeqno() {
        return receiptVoucherSeqno;
    }

    public void setReceiptVoucherSeqno(String receiptVoucherSeqno) {
        this.receiptVoucherSeqno = receiptVoucherSeqno;
    }

    public BigDecimal getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(BigDecimal vatAmt) {
        this.vatAmt = vatAmt;
    }

    public String getVatCurrencyCde() {
        return vatCurrencyCde;
    }

    public void setVatCurrencyCde(String vatCurrencyCde) {
        this.vatCurrencyCde = vatCurrencyCde;
    }

    public BigDecimal getReceiptVoucherActAmt() {
        return receiptVoucherActAmt;
    }

    public void setReceiptVoucherActAmt(BigDecimal receiptVoucherActAmt) {
        this.receiptVoucherActAmt = receiptVoucherActAmt;
    }

    public String getVatOrigReceivePlanSeqno() {
        return vatOrigReceivePlanSeqno;
    }

    public void setVatOrigReceivePlanSeqno(String vatOrigReceivePlanSeqno) {
        this.vatOrigReceivePlanSeqno = vatOrigReceivePlanSeqno;
    }

    public String getOtherBusiSeqno() {
        return otherBusiSeqno;
    }

    public void setOtherBusiSeqno(String otherBusiSeqno) {
        this.otherBusiSeqno = otherBusiSeqno;
    }

    @Override
    public String toString() {
        return "OlRentalTransDetail{" +
        "seqno=" + seqno +
        ", contractSeqno=" + contractSeqno +
        ", externalContractNbr=" + externalContractNbr +
        ", contractId=" + contractId +
        ", transSpvId=" + transSpvId +
        ", transSpvName=" + transSpvName +
        ", transDate=" + transDate +
        ", transType=" + transType +
        ", transAmt=" + transAmt +
        ", acctnoOut=" + acctnoOut +
        ", acctnoOutCurrency=" + acctnoOutCurrency +
        ", acctnoIn=" + acctnoIn +
        ", acctnoInCurrency=" + acctnoInCurrency +
        ", currencyTrans=" + currencyTrans +
        ", currencyStandard=" + currencyStandard +
        ", currencyReport=" + currencyReport +
        ", exchRteRmb=" + exchRteRmb +
        ", exchRteStandard=" + exchRteStandard +
        ", exchRteReport=" + exchRteReport +
        ", exchRteAcctOut=" + exchRteAcctOut +
        ", exchRteAcctIn=" + exchRteAcctIn +
        ", seqnoBeforeReverse=" + seqnoBeforeReverse +
        ", voucherId=" + voucherId +
        ", voucherStatus=" + voucherStatus +
        ", writeOffSeqno=" + writeOffSeqno +
        ", cashDepositSeqno=" + cashDepositSeqno +
        ", feeInfoSeqno=" + feeInfoSeqno +
        ", maintenFundSeqno=" + maintenFundSeqno +
        ", receivePlanSeqno=" + receivePlanSeqno +
        ", memo=" + memo +
        ", receiptVoucherSeqno=" + receiptVoucherSeqno +
        ", vatAmt=" + vatAmt +
        ", vatCurrencyCde=" + vatCurrencyCde +
        ", receiptVoucherActAmt=" + receiptVoucherActAmt +
        ", vatOrigReceivePlanSeqno=" + vatOrigReceivePlanSeqno +
        ", otherBusiSeqno=" + otherBusiSeqno +
        "}";
    }
}
