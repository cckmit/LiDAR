package com.lq.lidar.domain.vo;

import java.io.Serializable;

/**
 * <p>
 * 租赁物信息
 * </p>
 *
 * @author LQ
 * @since 2022-05-21
 */
public class OlAssetInfoAddVO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 租赁物编号
     */
    private String assetNo;

    /**
     * 租赁物名称
     */
    private String assetName;

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


}
