package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lq.lidar.domain.entity.CbayBpBizPtnrAcctInfo;
import com.lq.lidar.mapper.CbayBpBizPtnrAcctInfoMapper;
import com.lq.lidar.service.ICbayBpBizPtnrAcctInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@Service
public class CbayBpBizPtnrAcctInfoServiceImpl extends ServiceImpl<CbayBpBizPtnrAcctInfoMapper, CbayBpBizPtnrAcctInfo> implements ICbayBpBizPtnrAcctInfoService {

    @Override
    public List<Map<String, String>> findBpBizPtnrAcctInfo() {
        List<CbayBpBizPtnrAcctInfo> list = this.lambdaQuery().select(CbayBpBizPtnrAcctInfo::getBankAcctNbr
                ,CbayBpBizPtnrAcctInfo::getBankBrchNm,CbayBpBizPtnrAcctInfo::getBankNm).groupBy(CbayBpBizPtnrAcctInfo::getBankAcctNbr,CbayBpBizPtnrAcctInfo::getBankBrchNm,CbayBpBizPtnrAcctInfo::getBankNm).list();
        List<Map<String, String>> bpBizPtnrAcctInfos= Lists.newArrayListWithCapacity(list.size());
        list.forEach(cbayBpBizPtnrAcctInfo -> {
            if (StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctNbr())){
                HashMap<String, String> hashMap = Maps.newHashMapWithExpectedSize(2);
                StringBuilder label = new StringBuilder();
                label.append(cbayBpBizPtnrAcctInfo.getBankNm());
                label.append("-");
                if (StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankBrchNm())){
                    label.append(cbayBpBizPtnrAcctInfo.getBankBrchNm());
                    label.append("-");
                }
                label.append(cbayBpBizPtnrAcctInfo.getBankAcctNbr());
                hashMap.put("label",label.toString());
                hashMap.put("value",cbayBpBizPtnrAcctInfo.getBankAcctNbr());
                bpBizPtnrAcctInfos.add(hashMap);
            }
        });
        return bpBizPtnrAcctInfos;
    }
}
