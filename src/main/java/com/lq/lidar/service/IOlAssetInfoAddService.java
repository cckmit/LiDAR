package com.lq.lidar.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.domain.entity.OlAssetInfoAdd;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LQ
 * @since 2022-05-21
 */
public interface IOlAssetInfoAddService extends IService<OlAssetInfoAdd> {

    OlAssetInfoAdd getByAssetNo(String assetNo);

    void checkSaveOrUpdate(OlAssetInfoAdd olAssetInfoAddDTO);
}
