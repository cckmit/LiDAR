package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.domain.entity.OlAssetInfoAdd;
import com.lq.lidar.mapper.OlAssetInfoAddMapper;
import com.lq.lidar.service.IOlAssetInfoAddService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-05-21
 */
@Service
public class OlAssetInfoAddServiceImpl extends ServiceImpl<OlAssetInfoAddMapper, OlAssetInfoAdd> implements IOlAssetInfoAddService {

    @Override
    public OlAssetInfoAdd getByAssetNo(String assetNo) {
        return this.lambdaQuery().eq(OlAssetInfoAdd::getAssetNo, assetNo).one();
    }


    public void checkSaveOrUpdate(OlAssetInfoAdd olAssetInfoAdd) {
        if (olAssetInfoAdd.getOwnerDepartmentCde().equals("3")) {

            Assert.isTrue(StringUtils.isNotBlank(olAssetInfoAdd.getShipName()), "请填写船舶-船名！");

            Assert.isTrue(StringUtils.isNotBlank(olAssetInfoAdd.getShipImo()), "请填写船舶-IMO编号！");
        }
        if (olAssetInfoAdd.getOwnerDepartmentCde().equals("975686080361742336") || olAssetInfoAdd.getOwnerDepartmentCde().equals("975686080361742337")) {
            Assert.isTrue(StringUtils.isNotBlank(olAssetInfoAdd.getPlaneMsn()), "请填写飞机-MSN号！");
            Assert.isTrue(StringUtils.isNotBlank(olAssetInfoAdd.getPlaneType()), "请填写飞机-型号！");

        }
    }
}
