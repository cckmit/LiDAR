package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.Log;
import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.enums.BusinessType;
import com.lq.lidar.domain.entity.CbaySysPaymentCfg;
import com.lq.lidar.service.ICbaySysPaymentCfgService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 账号管理OL 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@RestController
@RequestMapping("/system/cbaySysPaymentCfg")
public class CbaySysPaymentCfgController extends BaseController {
    @Resource
    ICbaySysPaymentCfgService cbaySysPaymentCfgService;


    /**
     * 账号管理列表查询
     *
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity list(CbaySysPaymentCfg sysPaymentCfg) {
        startPage();
        List<CbaySysPaymentCfg> list = cbaySysPaymentCfgService.lambdaQuery()
                .eq(StringUtils.isNotBlank(sysPaymentCfg.getCrcyCd()),CbaySysPaymentCfg::getCrcyCd, sysPaymentCfg.getCrcyCd())
                .list();
        return ResponseEntity.success(getDataTable(list));
    }

    @PostMapping("/saveOrUpdate")
    @Log(title = "账号管理", businessType = BusinessType.INSERT)
    public ResponseEntity saveOrUpdate(@RequestBody @Validated CbaySysPaymentCfg sysPaymentCfg) {
        cbaySysPaymentCfgService.saveOrUpdateSysPaymentCfg(sysPaymentCfg);
        return ResponseEntity.success("操作成功");
    }

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

    @DeleteMapping("/delete/{collAcctCd}")
    @Log(title = "账号管理", businessType = BusinessType.DELETE)
    public ResponseEntity delete(@PathVariable String[] collAcctCd) {
        boolean update = cbaySysPaymentCfgService.removeBatchByIds(Arrays.asList(collAcctCd));
        if (update) {
            return ResponseEntity.success("删除成功");
        }
        return ResponseEntity.error("删除失败");
    }
}

