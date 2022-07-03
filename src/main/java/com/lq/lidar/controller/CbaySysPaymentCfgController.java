package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.service.ICbaySysPaymentCfgService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@RestController
@RequestMapping("/system/cbaySysPaymentCfg")
public class CbaySysPaymentCfgController {
    @Resource
    ICbaySysPaymentCfgService cbaySysPaymentCfgService;

    /**
     * 获取内部账号
     *
     * @return
     */
    @GetMapping("/findAllRecvAccounts")
    @TaskTime
    public ResponseEntity findAllRecvAccounts() {
        List<Map<String, String>> allRecvAccounts = cbaySysPaymentCfgService.findAllRecvAccounts();
        return ResponseEntity.success(allRecvAccounts);

    }
}

