package com.lq.lidar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;
import com.lq.lidar.mapper.OlAssetDepreciationDetailMapper;
import com.lq.lidar.service.IOlAssetDepreciationDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  资产折旧明细服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
@Service
public class OlAssetDepreciationDetailServiceImpl extends ServiceImpl<OlAssetDepreciationDetailMapper, OlAssetDepreciationDetail> implements IOlAssetDepreciationDetailService {

    @Override
    public List<OlAssetDepreciationDetail> getAssetDepreciationDetailByAssetAddSeqno(String assetAddSeqno) {
        List<OlAssetDepreciationDetail> list = this.lambdaQuery().eq(OlAssetDepreciationDetail::getAssetAddSeqno, assetAddSeqno)
                .orderByDesc(OlAssetDepreciationDetail::getDepreciationDate).list();
        return list;
    }
}
