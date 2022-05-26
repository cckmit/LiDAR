package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 资产减值明细表
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
@TableName("ol_asset_allowance_detail")
public class OlAssetAllowanceDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("\"SEQNO\"")
    private String seqno;

    /**
     * 租赁物信息主键
     */
    @TableField("\"ASSET_ADD_SEQNO\"")
    @NotBlank(message = "租赁物信息主键不能为空")
    private String assetAddSeqno;

    /**
     * 租赁物编号
     */
    @TableField("\"ASSET_NO\"")
    private String assetNo;

    /**
     * 租赁物名称
     */
    @TableField("\"ASSET_NAME\"")
    private String assetName;

    /**
     * 计提日期
     */
    @TableField("\"COUNT_DATE\"")
    private LocalDate countDate;

    /**
     * 原币币种
     */
    @TableField("\"CURRENCY\"")
    private String currency;

    /**
     * 计提金额-原币
     */
    @TableField("\"ALLOWANCE_AMT\"")
    private BigDecimal allowanceAmt;

    /**
     * 计提金额-人民币
     */
    @TableField("\"ALLOWANCE_AMT_RMB\"")
    private BigDecimal allowanceAmtRmb;

    /**
     * 备注
     */
    @TableField("\"MEMO\"")
    private String memo;

    /**
     * 折人民币汇率
     */
    @TableField("\"EXCH_RATE_RMB\"")
    private BigDecimal exchRateRmb;

    @TableField("\"VOUCHER_ID\"")
    private String voucherId;

    @TableField("\"VOUCHER_STATUS\"")
    private String voucherStatus;

    @TableField("\"APPROVE_STATUS\"")
    private String approveStatus;

    @TableField("\"ALLOWANCE_DESC\"")
    private String allowanceDesc;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getAssetAddSeqno() {
        return assetAddSeqno;
    }

    public void setAssetAddSeqno(String assetAddSeqno) {
        this.assetAddSeqno = assetAddSeqno;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public LocalDate getCountDate() {
        return countDate;
    }

    public void setCountDate(LocalDate countDate) {
        this.countDate = countDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAllowanceAmt() {
        return allowanceAmt;
    }

    public void setAllowanceAmt(BigDecimal allowanceAmt) {
        this.allowanceAmt = allowanceAmt;
    }

    public BigDecimal getAllowanceAmtRmb() {
        return allowanceAmtRmb;
    }

    public void setAllowanceAmtRmb(BigDecimal allowanceAmtRmb) {
        this.allowanceAmtRmb = allowanceAmtRmb;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getExchRateRmb() {
        return exchRateRmb;
    }

    public void setExchRateRmb(BigDecimal exchRateRmb) {
        this.exchRateRmb = exchRateRmb;
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

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getAllowanceDesc() {
        return allowanceDesc;
    }

    public void setAllowanceDesc(String allowanceDesc) {
        this.allowanceDesc = allowanceDesc;
    }

    @Override
    public String toString() {
        return "OlAssetAllowanceDetail{" +
                "seqno=" + seqno +
                ", assetAddSeqno=" + assetAddSeqno +
                ", assetNo=" + assetNo +
                ", assetName=" + assetName +
                ", countDate=" + countDate +
                ", currency=" + currency +
                ", allowanceAmt=" + allowanceAmt +
                ", allowanceAmtRmb=" + allowanceAmtRmb +
                ", memo=" + memo +
                ", exchRateRmb=" + exchRateRmb +
                ", voucherId=" + voucherId +
                ", voucherStatus=" + voucherStatus +
                ", approveStatus=" + approveStatus +
                ", allowanceDesc=" + allowanceDesc +
                "}";
    }
}
