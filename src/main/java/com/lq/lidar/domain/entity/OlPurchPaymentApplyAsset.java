package com.lq.lidar.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 付款审批与资产关系表
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@TableName("ol_purch_payment_apply_asset")
public class OlPurchPaymentApplyAsset implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("\"SEQNO\"")
    private String seqno;

    /**
     * 采购合同ID
     */
    @TableField("\"CONTRACT_ID\"")
    private String contractId;

    /**
     * 采购合同外部合同号
     */
    @TableField("\"EXTERNAL_CONTRACT_NBR\"")
    private String externalContractNbr;

    /**
     * 采购合同主键
     */
    @TableField("\"CONTRACT_SEQNO\"")
    private String contractSeqno;

    /**
     * 付款审批表主键
     */
    @TableField("\"APPLY_SEQNO\"")
    private String applySeqno;

    /**
     * 租赁物附加信息表主键
     */
    @TableField("\"ASSET_INFO_ADD_SEQNO\"")
    private String assetInfoAddSeqno;

    /**
     * 分配比例
     */
    @TableField("\"AMT_PERCENT\"")
    private BigDecimal amtPercent;

    /**
     * 分配金额
     */
    @TableField("\"AMT\"")
    private BigDecimal amt;


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

    public String getAssetInfoAddSeqno() {
        return assetInfoAddSeqno;
    }

    public void setAssetInfoAddSeqno(String assetInfoAddSeqno) {
        this.assetInfoAddSeqno = assetInfoAddSeqno;
    }

    public BigDecimal getAmtPercent() {
        return amtPercent;
    }

    public void setAmtPercent(BigDecimal amtPercent) {
        this.amtPercent = amtPercent;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "OlPurchPaymentApplyAsset{" +
        "seqno=" + seqno +
        ", contractId=" + contractId +
        ", externalContractNbr=" + externalContractNbr +
        ", contractSeqno=" + contractSeqno +
        ", applySeqno=" + applySeqno +
        ", assetInfoAddSeqno=" + assetInfoAddSeqno +
        ", amtPercent=" + amtPercent +
        ", amt=" + amt +
        "}";
    }
}
