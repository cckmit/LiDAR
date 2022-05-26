package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.service.IOlAssetAllowanceDetailService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
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
    @TaskTime
    public ResponseEntity getAssetAllowanceDetailByAssetAddSeqno(@PathVariable String assetAddSeqno) {
        List<OlAssetAllowanceDetail> list = assetAllowanceDetailService.getOlAssetAllowanceDetailByAssetAddSeqno(assetAddSeqno);
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 保存更新资产资产减值明细
     * @param assetAllowanceDetail
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated OlAssetAllowanceDetail assetAllowanceDetail) {
        boolean save = assetAllowanceDetailService.saveOrUpdate(assetAllowanceDetail);
        if (save) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 根据主键获取减值明细
     * @param seqno
     * @return
     */
    @TaskTime
    @GetMapping("/getOlAssetAllowanceDetailBySeqno/{seqno}")
    public ResponseEntity getOlAssetAllowanceDetailBySeqno(@PathVariable String seqno) {
        OlAssetAllowanceDetail assetAllowanceDetail = assetAllowanceDetailService.getById(seqno);
        return ResponseEntity.success(assetAllowanceDetail);
    }

    /**
     * 删除资产减值明细
     * @param seqno
     * @return
     */
    @DeleteMapping("/delete/{seqno}")
    @TaskTime
    public ResponseEntity delete(@PathVariable String[] seqno) {
        boolean update = assetAllowanceDetailService.removeBatchByIds(Arrays.asList(seqno));
        if (update) {
            return ResponseEntity.success("删除成功");
        }
        return ResponseEntity.error("删除失败");
    }
}

