package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.domain.entity.CbayBpBizPtnrAcctInfo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
public interface ICbayBpBizPtnrAcctInfoService extends IService<CbayBpBizPtnrAcctInfo> {

    /**
     * 获取合作伙伴账户
     * @return
     */
    List<Map<String, String>> findBpBizPtnrAcctInfo();


}
