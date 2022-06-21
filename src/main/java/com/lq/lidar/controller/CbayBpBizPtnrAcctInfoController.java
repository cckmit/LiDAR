package com.lq.lidar.controller;


import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.service.ICbayBpBizPtnrAcctInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  合作伙伴账户前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@RestController
@CrossOrigin
@RequestMapping("/system/cbayBpBizPtnrAcctInfo")
public class CbayBpBizPtnrAcctInfoController {
    @Resource
    ICbayBpBizPtnrAcctInfoService cbayBpBizPtnrAcctInfoService;

    @GetMapping("/findBpBizPtnrAcctInfo")
    public ResponseEntity findBpBizPtnrAcctInfo(){
        List<Map<String, String>> bpBizPtnrAcctInfo = cbayBpBizPtnrAcctInfoService.findBpBizPtnrAcctInfo();
        return ResponseEntity.success(bpBizPtnrAcctInfo);
    }

}

