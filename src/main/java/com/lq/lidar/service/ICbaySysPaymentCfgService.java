package com.lq.lidar.service;

import com.lq.lidar.domain.entity.CbaySysPaymentCfg;
import com.baomidou.mybatisplus.extension.service.IService;

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
public interface ICbaySysPaymentCfgService extends IService<CbaySysPaymentCfg> {

    /**
     * 获取收款账号
     */
    public List<Map<String, String>> findAllRecvAccounts();
}
