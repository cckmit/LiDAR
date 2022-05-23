package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.mapper.OlAssetAllowanceDetailMapper;
import com.lq.lidar.service.IOlAssetAllowanceDetailService;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 资产减值明细 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
@Service
public class OlAssetAllowanceDetailServiceImpl extends ServiceImpl<OlAssetAllowanceDetailMapper, OlAssetAllowanceDetail> implements IOlAssetAllowanceDetailService {

    @Override
    public List<OlAssetAllowanceDetail> getOlAssetAllowanceDetailByAssetAddSeqno(String assetAddSeqno) {
        List<OlAssetAllowanceDetail> list = this.lambdaQuery().eq(OlAssetAllowanceDetail::getAssetAddSeqno, assetAddSeqno).list();
        return list;
    }
}
