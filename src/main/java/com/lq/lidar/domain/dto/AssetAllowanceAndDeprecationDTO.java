package com.lq.lidar.domain.dto;

import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;

import java.util.List;

/**
 * 租赁物折旧和减值信息
 */
public class AssetAllowanceAndDeprecationDTO {
    /**
     * 租赁物附属主键
     */
    private String assetAddSeqno;
    /**
     * 资产折旧明细
     */
    private List<OlAssetDepreciationDetail> olAssetDepreciationDetails;
    /**
     * 资产减值明细
     */
    private List<OlAssetAllowanceDetail> olAssetAllowanceDetails;

    public String getAssetAddSeqno() {
        return assetAddSeqno;
    }

    public void setAssetAddSeqno(String assetAddSeqno) {
        this.assetAddSeqno = assetAddSeqno;
    }

    public List<OlAssetDepreciationDetail> getOlAssetDepreciationDetails() {
        return olAssetDepreciationDetails;
    }

    public void setOlAssetDepreciationDetails(List<OlAssetDepreciationDetail> olAssetDepreciationDetails) {
        this.olAssetDepreciationDetails = olAssetDepreciationDetails;
    }

    public List<OlAssetAllowanceDetail> getOlAssetAllowanceDetails() {
        return olAssetAllowanceDetails;
    }

    public void setOlAssetAllowanceDetails(List<OlAssetAllowanceDetail> olAssetAllowanceDetails) {
        this.olAssetAllowanceDetails = olAssetAllowanceDetails;
    }
}
