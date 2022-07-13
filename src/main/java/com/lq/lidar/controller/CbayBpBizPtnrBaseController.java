package com.lq.lidar.controller;


import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.utils.DataConvert;
import com.lq.lidar.domain.entity.CbayBpBizPtnrBase;
import com.lq.lidar.service.ICbayBpBizPtnrBaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@RestController
@RequestMapping("/system/cbayBpBizPtnrBase")
public class CbayBpBizPtnrBaseController {

    @Resource
    ICbayBpBizPtnrBaseService cbayBpBizPtnrBaseService;

    /**
     * 根据合作伙伴类型查询合作伙伴（下拉框使用）
     *
     * @param bpTypeCd 合作伙伴类型
     * @return
     */
    @GetMapping("/findBpBizPtnrBaseByBpTypeCd/{bpTypeCd}")
    public ResponseEntity findBpBizPtnrBaseByBpTypeCd(@PathVariable String bpTypeCd) {
        List<CbayBpBizPtnrBase> cbayBpBizPtnrBases = cbayBpBizPtnrBaseService.lambdaQuery().eq(CbayBpBizPtnrBase::getBpTypeCd, bpTypeCd).list();
        List list = DataConvert.ListToLV(cbayBpBizPtnrBases,CbayBpBizPtnrBase::getBpNm,CbayBpBizPtnrBase::getBpId);
        return ResponseEntity.success(list);
    }

}

