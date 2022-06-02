package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 收款单表
 * </p>
 *
 * @author LQ
 * @since 2022-05-30
 */
@TableName("ol_rental_receipt_voucher")
public class OlRentalReceiptVoucher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，没有业务含义，系统自动生成
     */
    @TableId("SEQNO")
    private String seqno;

    /**
     * 收据编号
     */
    @TableField("RECEIPT_NO")
    private String receiptNo;

    /**
     * 收款日期
     */
    @TableField("ARRIVE_DATE")
    private LocalDateTime arriveDate;

    /**
     * 实际收款金额
     */
    @TableField("ACT_AMT")
    private BigDecimal actAmt;

    /**
     * 应核销金额
     */
    @TableField("WRITE_OFF_AMT")
    private BigDecimal writeOffAmt;

    /**
     * 已核销金额
     */
    @TableField("CONFIRM_AMT")
    private BigDecimal confirmAmt;

    /**
     * 退款金额
     */
    @TableField("REFUND_AMT")
    private BigDecimal refundAmt;

    /**
     * 付款人ID
     */
    @TableField("PAYER_ID")
    private String payerId;

    /**
     * 付款人名称
     */
    @TableField("PAYER_NAME")
    private String payerName;

    /**
     * 付款账号
     */
    @TableField("PAY_ACCT_NO")
    private String payAcctNo;

    /**
     * 付款银行
     */
    @TableField("PAY_BANK_CDE")
    private String payBankCde;

    /**
     * 付款户名
     */
    @TableField("PAY_ACCT_NAME")
    private String payAcctName;

    /**
     * 收款账号
     */
    @TableField("RECV_ACCT_NO")
    private String recvAcctNo;

    /**
     * 收款银行
     */
    @TableField("RECV_BANK_CDE")
    private String recvBankCde;

    /**
     * 收款人ID
     */
    @TableField("RECEIVER_ID")
    private String receiverId;

    /**
     * 收款人名称
     */
    @TableField("RECEIVER_NAME")
    private String receiverName;

    /**
     * 合同表主键
     */
    @TableField("CONTRACT_SEQNO")
    private String contractSeqno;

    /**
     * 外部合同号
     */
    @TableField("EXTERNAL_CONTRACT_NBR")
    private String externalContractNbr;

    /**
     * 合同ID
     */
    @TableField("CONTRACT_ID")
    private String contractId;

    /**
     * 操作人ID
     */
    @TableField("OPERATOR_ID")
    private String operatorId;

    /**
     * 操作人名称
     */
    @TableField("OPERATOR_NAME")
    private String operatorName;

    /**
     * 未核销/部分核销/已核销
     */
    @TableField("WRITE_OFF_STATUS")
    private String writeOffStatus;

    /**
     * 备注
     */
    @TableField("MEMO")
    private String memo;

    @TableField("CURRENCY_CDE")
    private String currencyCde;

    /**
     * 部门代码
     */
    @TableField("DEPARTMENT_CDE")
    private String departmentCde;

    /**
     * 是否暂存
     */
    @TableField("IS_TEMP_SAVE")
    private String isTempSave;

    @TableField("IS_DEPOSIT_DEDUCT")
    private String isDepositDeduct;

    @TableField("IS_PAYER_CASH_FLOW")
    private String isPayerCashFlow;

    @TableField("IS_RECEIVER_CASH_FLOW")
    private String isReceiverCashFlow;

    @TableField("IS_PAYMENT_ON_CREDIT")
    private String isPaymentOnCredit;

    @TableField("VOUCHERED_FEE_AMT")
    private BigDecimal voucheredFeeAmt;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public LocalDateTime getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(LocalDateTime arriveDate) {
        this.arriveDate = arriveDate;
    }

    public BigDecimal getActAmt() {
        return actAmt;
    }

    public void setActAmt(BigDecimal actAmt) {
        this.actAmt = actAmt;
    }

    public BigDecimal getWriteOffAmt() {
        return writeOffAmt;
    }

    public void setWriteOffAmt(BigDecimal writeOffAmt) {
        this.writeOffAmt = writeOffAmt;
    }

    public BigDecimal getConfirmAmt() {
        return confirmAmt;
    }

    public void setConfirmAmt(BigDecimal confirmAmt) {
        this.confirmAmt = confirmAmt;
    }

    public BigDecimal getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(BigDecimal refundAmt) {
        this.refundAmt = refundAmt;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayAcctNo() {
        return payAcctNo;
    }

    public void setPayAcctNo(String payAcctNo) {
        this.payAcctNo = payAcctNo;
    }

    public String getPayBankCde() {
        return payBankCde;
    }

    public void setPayBankCde(String payBankCde) {
        this.payBankCde = payBankCde;
    }

    public String getPayAcctName() {
        return payAcctName;
    }

    public void setPayAcctName(String payAcctName) {
        this.payAcctName = payAcctName;
    }

    public String getRecvAcctNo() {
        return recvAcctNo;
    }

    public void setRecvAcctNo(String recvAcctNo) {
        this.recvAcctNo = recvAcctNo;
    }

    public String getRecvBankCde() {
        return recvBankCde;
    }

    public void setRecvBankCde(String recvBankCde) {
        this.recvBankCde = recvBankCde;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getWriteOffStatus() {
        return writeOffStatus;
    }

    public void setWriteOffStatus(String writeOffStatus) {
        this.writeOffStatus = writeOffStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCurrencyCde() {
        return currencyCde;
    }

    public void setCurrencyCde(String currencyCde) {
        this.currencyCde = currencyCde;
    }

    public String getDepartmentCde() {
        return departmentCde;
    }

    public void setDepartmentCde(String departmentCde) {
        this.departmentCde = departmentCde;
    }

    public String getIsTempSave() {
        return isTempSave;
    }

    public void setIsTempSave(String isTempSave) {
        this.isTempSave = isTempSave;
    }

    public String getIsDepositDeduct() {
        return isDepositDeduct;
    }

    public void setIsDepositDeduct(String isDepositDeduct) {
        this.isDepositDeduct = isDepositDeduct;
    }

    public String getIsPayerCashFlow() {
        return isPayerCashFlow;
    }

    public void setIsPayerCashFlow(String isPayerCashFlow) {
        this.isPayerCashFlow = isPayerCashFlow;
    }

    public String getIsReceiverCashFlow() {
        return isReceiverCashFlow;
    }

    public void setIsReceiverCashFlow(String isReceiverCashFlow) {
        this.isReceiverCashFlow = isReceiverCashFlow;
    }

    public String getIsPaymentOnCredit() {
        return isPaymentOnCredit;
    }

    public void setIsPaymentOnCredit(String isPaymentOnCredit) {
        this.isPaymentOnCredit = isPaymentOnCredit;
    }

    public BigDecimal getVoucheredFeeAmt() {
        return voucheredFeeAmt;
    }

    public void setVoucheredFeeAmt(BigDecimal voucheredFeeAmt) {
        this.voucheredFeeAmt = voucheredFeeAmt;
    }

    @Override
    public String toString() {
        return "OlRentalReceiptVoucher{" +
                "seqno=" + seqno +
                ", receiptNo=" + receiptNo +
                ", arriveDate=" + arriveDate +
                ", actAmt=" + actAmt +
                ", writeOffAmt=" + writeOffAmt +
                ", confirmAmt=" + confirmAmt +
                ", refundAmt=" + refundAmt +
                ", payerId=" + payerId +
                ", payerName=" + payerName +
                ", payAcctNo=" + payAcctNo +
                ", payBankCde=" + payBankCde +
                ", payAcctName=" + payAcctName +
                ", recvAcctNo=" + recvAcctNo +
                ", recvBankCde=" + recvBankCde +
                ", receiverId=" + receiverId +
                ", receiverName=" + receiverName +
                ", contractSeqno=" + contractSeqno +
                ", externalContractNbr=" + externalContractNbr +
                ", contractId=" + contractId +
                ", operatorId=" + operatorId +
                ", operatorName=" + operatorName +
                ", writeOffStatus=" + writeOffStatus +
                ", memo=" + memo +
                ", currencyCde=" + currencyCde +
                ", departmentCde=" + departmentCde +
                ", isTempSave=" + isTempSave +
                ", isDepositDeduct=" + isDepositDeduct +
                ", isPayerCashFlow=" + isPayerCashFlow +
                ", isReceiverCashFlow=" + isReceiverCashFlow +
                ", isPaymentOnCredit=" + isPaymentOnCredit +
                ", voucheredFeeAmt=" + voucheredFeeAmt +
                "}";
    }
}
