package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;
import com.lq.lidar.service.IOlAssetDepreciationDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 资产折旧明细前端控制器
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
    @TaskTime
    public ResponseEntity getAssetDepreciationDetailByAssetAddSeqno(@PathVariable String assetAddSeqno) {
        List<OlAssetDepreciationDetail> list = assetDepreciationDetailService.getAssetDepreciationDetailByAssetAddSeqno(assetAddSeqno);
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 保存更新资产折旧明细
     * @param depreciationDetail
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody OlAssetDepreciationDetail depreciationDetail) {
        boolean save = assetDepreciationDetailService.saveOrUpdate(depreciationDetail);
        if (save) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 获取折旧明细
     * @param seqno
     * @return
     */
    @TaskTime
    @GetMapping("/getOlAssetDepreciationDetailBySeqno/{seqno}")
    public ResponseEntity getOlAssetDepreciationDetailBySeqno(@PathVariable String seqno) {
        OlAssetDepreciationDetail assetDepreciationDetail = assetDepreciationDetailService.getById(seqno);
        return ResponseEntity.success(assetDepreciationDetail);
    }
}

