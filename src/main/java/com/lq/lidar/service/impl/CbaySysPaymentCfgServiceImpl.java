package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lq.lidar.common.utils.DictConvert;
import com.lq.lidar.domain.entity.CbayBpBizPtnrBase;
import com.lq.lidar.domain.entity.CbaySysPaymentCfg;
import com.lq.lidar.mapper.CbayBpBizPtnrBaseMapper;
import com.lq.lidar.mapper.CbaySysPaymentCfgMapper;
import com.lq.lidar.service.ICbaySysPaymentCfgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@Service
public class CbaySysPaymentCfgServiceImpl extends ServiceImpl<CbaySysPaymentCfgMapper, CbaySysPaymentCfg> implements ICbaySysPaymentCfgService {

    @Resource
    CbayBpBizPtnrBaseMapper cbayBpBizPtnrBaseMapper;
    @Resource
    DictConvert dictConvert;

    @Override
    public List<Map<String, String>> findAllRecvAccounts() {
        List<CbaySysPaymentCfg> list = this.list();
        List<Map<String, String>> accountNumberList = Lists.newArrayListWithCapacity(list.size());
        for (CbaySysPaymentCfg sysPaymentCfg : list) {
            sysPaymentCfg.setCrcyCd(dictConvert.DictValueToLabel(sysPaymentCfg.getCrcyCd()));
            CbayBpBizPtnrBase cbayBpBizPtnrBase = cbayBpBizPtnrBaseMapper.selectById(sysPaymentCfg.getBankId());
            String recvBankCde = null;
            if (cbayBpBizPtnrBase != null) {
                recvBankCde = cbayBpBizPtnrBase.getBpNm();
            }
            Map<String, String> map = Maps.newHashMapWithExpectedSize(2);
            StringBuilder label = new StringBuilder(sysPaymentCfg.getAccNbr() + "-" + sysPaymentCfg.getAccountNm());
            if (recvBankCde == null && sysPaymentCfg.getAlias() == null) {
                map.put("label", label
                        .append("-")
                        .append(sysPaymentCfg.getCrcyCd())
                        .toString());

            } else if (recvBankCde != null && sysPaymentCfg.getAlias() == null) {
                map.put("label", label
                        .append("-")
                        .append(recvBankCde)
                        .append("-")
                        .append(sysPaymentCfg.getCrcyCd())
                        .toString()
                );

            } else if (recvBankCde == null && sysPaymentCfg.getAlias() != null) {
                map.put("label", label
                        .append("-")
                        .append(sysPaymentCfg.getCrcyCd())
                        .append("-")
                        .append(sysPaymentCfg.getAlias())
                        .toString()
                );

            } else if (recvBankCde != null && sysPaymentCfg.getAlias() != null) {
                map.put("label", label
                        .append("-")
                        .append(recvBankCde)
                        .append(sysPaymentCfg.getCrcyCd())
                        .append("-")
                        .append(sysPaymentCfg.getAlias())
                        .toString()

                );

            }
            map.put("value", sysPaymentCfg.getAccNbr());

            accountNumberList.add(map);
        }
        return accountNumberList;
    }
}
