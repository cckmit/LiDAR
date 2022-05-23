package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;

import java.util.List;

/**
 * <p>
 * 资产折旧服务类
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
public interface IOlAssetDepreciationDetailService extends IService<OlAssetDepreciationDetail> {
    /**
     * 根据资产主键获取资产折旧明细
     *
     * @param assetAddSeqno
     * @return
     */
    List<OlAssetDepreciationDetail> getAssetDepreciationDetailByAssetAddSeqno(String assetAddSeqno);

}
