package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;

import java.util.List;

/**
 * <p>
 *  资产减值明细服务类
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
public interface IOlAssetAllowanceDetailService extends IService<OlAssetAllowanceDetail> {

    /**
     * 根据资产主键获取资产减值明细
     * @param assetAddSeqno 资产主键
     * @return
     */
    List<OlAssetAllowanceDetail> getOlAssetAllowanceDetailByAssetAddSeqno(String assetAddSeqno);

}
