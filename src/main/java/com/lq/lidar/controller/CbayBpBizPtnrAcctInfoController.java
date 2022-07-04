package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.CbayBpBizPtnrAcctInfo;
import com.lq.lidar.service.ICbayBpBizPtnrAcctInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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

    @GetMapping("/list")
    public ResponseEntity list(CbayBpBizPtnrAcctInfo cbayBpBizPtnrAcctInfo) {
        startPage();
        List<CbayBpBizPtnrAcctInfo> list = cbayBpBizPtnrAcctInfoService.lambdaQuery()
                .like(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctNbr()), CbayBpBizPtnrAcctInfo::getBankAcctNbr, cbayBpBizPtnrAcctInfo.getBankAcctNbr())
                .like(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankNm()), CbayBpBizPtnrAcctInfo::getBankNm, cbayBpBizPtnrAcctInfo.getBankNm())
                .eq(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctTypeCd()), CbayBpBizPtnrAcctInfo::getBankAcctTypeCd, cbayBpBizPtnrAcctInfo.getBankAcctTypeCd())
                .like(StringUtils.isNotBlank(cbayBpBizPtnrAcctInfo.getBankAcctNm()), CbayBpBizPtnrAcctInfo::getBankAcctNm, cbayBpBizPtnrAcctInfo.getBankAcctNm())
                .list();
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 合作伙伴下拉框
     *
     * @return
     */
    @GetMapping("/findBpBizPtnrAcctInfo")
    public ResponseEntity findBpBizPtnrAcctInfo() {
        List<Map<String, String>> bpBizPtnrAcctInfo = cbayBpBizPtnrAcctInfoService.findBpBizPtnrAcctInfo();
        return ResponseEntity.success(bpBizPtnrAcctInfo);
    }

    @GetMapping("/findBpBizPtnrAcctInfoByBpBankAcctId")
    public ResponseEntity findBpBizPtnrAcctInfoByBpBankAcctId(String bpBankAcctId) {
        CbayBpBizPtnrAcctInfo cbayBpBizPtnrAcctInfo = cbayBpBizPtnrAcctInfoService.getById(bpBankAcctId);
        return ResponseEntity.success(cbayBpBizPtnrAcctInfo);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(String bpBankAcctId) {
        if (cbayBpBizPtnrAcctInfoService.removeById(bpBankAcctId)) {
            return ResponseEntity.success("删除成功！");
        }
        return ResponseEntity.error("删除失败！");
    }


}

