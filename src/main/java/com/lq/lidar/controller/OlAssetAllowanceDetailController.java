package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;
import com.lq.lidar.service.IOlAssetAllowanceDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  资产减值明细前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
@RestController
@RequestMapping("/asset/olAssetAllowanceDetail")
@CrossOrigin
public class OlAssetAllowanceDetailController extends BaseController {

    @Resource
    IOlAssetAllowanceDetailService assetAllowanceDetailService;

    /**
     * 根据租赁物id获取资产减值明细
     * @param assetAddSeqno
     * @return
     */
    @GetMapping("/getAssetAllowanceDetailByAssetAddSeqno/{assetAddSeqno}")
    public ResponseEntity getAssetAllowanceDetailByAssetAddSeqno(@PathVariable String assetAddSeqno) {
        List<OlAssetAllowanceDetail> list = assetAllowanceDetailService.getOlAssetAllowanceDetailByAssetAddSeqno(assetAddSeqno);
        return ResponseEntity.success(getDataTable(list));
    }
}

