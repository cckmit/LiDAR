package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.Log;
import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.enums.BusinessType;
import com.lq.lidar.domain.entity.CbayBpBizPtnrAcctInfo;
import com.lq.lidar.domain.entity.CbayBpBizPtnrBase;
import com.lq.lidar.service.ICbayBpBizPtnrAcctInfoService;
import com.lq.lidar.service.ICbayBpBizPtnrBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 合作伙伴账户前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@RestController
@RequestMapping("/system/cbayBpBizPtnrAcctInfo")
public class CbayBpBizPtnrAcctInfoController extends BaseController {
    @Resource
    ICbayBpBizPtnrAcctInfoService cbayBpBizPtnrAcctInfoService;
    @Resource
    ICbayBpBizPtnrBaseService cbayBpBizPtnrBaseService;

    @GetMapping("/list")
    public ResponseEntity list(CbayBpBizPtnrAcctInfo cbayBpBizPtnrAcctInfo) {
        startPage();
        List<CbayBpBizPtnrAcctInfo> list = cbayBpBizPtnrAcctInfoService.lambdaQuery()
                .like(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctNbr()), CbayBpBizPtnrAcctInfo::getBankAcctNbr, cbayBpBizPtnrAcctInfo.getBankAcctNbr())
                .like(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankNm()), CbayBpBizPtnrAcctInfo::getBankNm, cbayBpBizPtnrAcctInfo.getBankNm())
                .eq(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctTypeCd()), CbayBpBizPtnrAcctInfo::getBankAcctTypeCd, cbayBpBizPtnrAcctInfo.getBankAcctTypeCd())
                .like(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctNm()), CbayBpBizPtnrAcctInfo::getBankAcctNm, cbayBpBizPtnrAcctInfo.getBankAcctNm())
                .isNotNull(CbayBpBizPtnrAcctInfo::getCreatTime)
                .orderByDesc(CbayBpBizPtnrAcctInfo::getCreatTime)
                .orderByAsc(CbayBpBizPtnrAcctInfo::getBpId)
                .list();
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 新增/编辑合作伙伴
     * @param cbayBpBizPtnrAcctInfo
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @TaskTime
    @Log(title = "合作伙伴账户",businessType = BusinessType.INSERT)
    public ResponseEntity saveOrUpdate(@RequestBody @Validated CbayBpBizPtnrAcctInfo cbayBpBizPtnrAcctInfo) {
        CbayBpBizPtnrBase cbayBpBizPtnrBase = cbayBpBizPtnrBaseService.getById(cbayBpBizPtnrAcctInfo.getBpId());
        cbayBpBizPtnrAcctInfo.setBankAcctNm(cbayBpBizPtnrBase.getBpNm());
        cbayBpBizPtnrAcctInfo.setCreatTime(LocalDateTime.now());
        boolean save = cbayBpBizPtnrAcctInfoService.saveOrUpdate(cbayBpBizPtnrAcctInfo);
        if (save) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 合作伙伴账号下拉框
     *
     * @return
     */
    @GetMapping("/findBpBizPtnrAcctInfo")
    public ResponseEntity findBpBizPtnrAcctInfo() {
        List<Map<String, String>> bpBizPtnrAcctInfo = cbayBpBizPtnrAcctInfoService.findBpBizPtnrAcctInfo();
        return ResponseEntity.success(bpBizPtnrAcctInfo);
    }

    @GetMapping("/findBpBizPtnrAcctInfoByBpBankAcctId/{bpBankAcctId}")
    public ResponseEntity findBpBizPtnrAcctInfoByBpBankAcctId(@PathVariable String bpBankAcctId) {
        CbayBpBizPtnrAcctInfo cbayBpBizPtnrAcctInfo = cbayBpBizPtnrAcctInfoService.getById(bpBankAcctId);
        return ResponseEntity.success(cbayBpBizPtnrAcctInfo);
    }

    @DeleteMapping("/delete/{bpBankAcctId}")
    public ResponseEntity delete(@PathVariable String[] bpBankAcctId) {
        if (cbayBpBizPtnrAcctInfoService.removeBatchByIds(Arrays.asList(bpBankAcctId))) {
            return ResponseEntity.success("删除成功！");
        }
        return ResponseEntity.error("删除失败！");
    }


}

