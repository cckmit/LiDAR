package com.lq.lidar.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 资产折旧明细表
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
@TableName("ol_asset_depreciation_detail")
public class OlAssetDepreciationDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("SEQNO")
    private String seqno;

    /**
     * 租赁物编号
     */
    @TableId("ASSET_NO")
    private String assetNo;

    /**
     * 租赁物名称
     */
    @TableId("ASSET_NAME")
    private String assetName;

    /**
     * 租赁物附属信息主键
     */
    @TableField("ASSET_ADD_SEQNO")
    private String assetAddSeqno;

    /**
     * 折旧日期
     */
    @TableId("DEPRECIATION_DATE")
    private LocalDateTime depreciationDate;

    /**
     * 原币币种
     */
    @TableField("CURRENCY")
    private String currency;

    /**
     * 折旧金额-原币
     */
    @TableField("DEPRECIATION_AMT")
    private BigDecimal depreciationAmt;

    /**
     * 折旧金额-人民币
     */
    @TableId("DEPRECIATION_AMT_RMB")
    private BigDecimal depreciationAmtRmb;

    /**
     * 备注
     */
    @TableField("MEMO")
    private String memo;

    /**
     * 折人民币汇率
     */
    @TableField("EXCH_RATE_RMB")
    private BigDecimal exchRateRmb;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
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

    public String getAssetAddSeqno() {
        return assetAddSeqno;
    }

    public void setAssetAddSeqno(String assetAddSeqno) {
        this.assetAddSeqno = assetAddSeqno;
    }

    public LocalDateTime getDepreciationDate() {
        return depreciationDate;
    }

    public void setDepreciationDate(LocalDateTime depreciationDate) {
        this.depreciationDate = depreciationDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getDepreciationAmt() {
        return depreciationAmt;
    }

    public void setDepreciationAmt(BigDecimal depreciationAmt) {
        this.depreciationAmt = depreciationAmt;
    }

    public BigDecimal getDepreciationAmtRmb() {
        return depreciationAmtRmb;
    }

    public void setDepreciationAmtRmb(BigDecimal depreciationAmtRmb) {
        this.depreciationAmtRmb = depreciationAmtRmb;
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

    @Override
    public String toString() {
        return "OlAssetDepreciationDetail{" +
        "seqno=" + seqno +
        ", assetNo=" + assetNo +
        ", assetName=" + assetName +
        ", assetAddSeqno=" + assetAddSeqno +
        ", depreciationDate=" + depreciationDate +
        ", currency=" + currency +
        ", depreciationAmt=" + depreciationAmt +
        ", depreciationAmtRmb=" + depreciationAmtRmb +
        ", memo=" + memo +
        ", exchRateRmb=" + exchRateRmb +
        "}";
    }
}
