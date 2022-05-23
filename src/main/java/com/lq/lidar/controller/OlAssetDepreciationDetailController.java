package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;
import com.lq.lidar.service.IOlAssetAllowanceDetailService;
import com.lq.lidar.service.IOlAssetDepreciationDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 资产折旧前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-05-22
 */
@RestController
@RequestMapping("/asset/olAssetDepreciationDetail")
@CrossOrigin
public class OlAssetDepreciationDetailController extends BaseController {
    @Resource
    IOlAssetDepreciationDetailService assetDepreciationDetailService;

    /**
     * 根据租赁物主键获取折旧明细
     *
     * @param assetAddSeqno
     * @return
     */
    @GetMapping("/getAssetDepreciationDetailByAssetAddSeqno/{assetAddSeqno}")
    public ResponseEntity getAssetDepreciationDetailByAssetAddSeqno(@PathVariable String assetAddSeqno) {
        List<OlAssetDepreciationDetail> list = assetDepreciationDetailService.getAssetDepreciationDetailByAssetAddSeqno(assetAddSeqno);
        return ResponseEntity.success(getDataTable(list));
    }
}

