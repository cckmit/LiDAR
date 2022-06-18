package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.utils.JacksonUtil;
import com.lq.lidar.domain.dto.OlPurchPaymentApprovalDTO;
import com.lq.lidar.domain.entity.OlPurchPaymentApproval;
import com.lq.lidar.service.IOlPurchPaymentApprovalService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 采购付款审批前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-13
 */
@RestController
@CrossOrigin
@RequestMapping("/purch/olPurchPaymentApproval")
public class OlPurchPaymentApprovalController extends BaseController {


    @Resource
    private IOlPurchPaymentApprovalService olPurchPaymentApprovalService;

    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(OlPurchPaymentApproval olPurchPaymentApproval) {
        String userId = "admin";
        startPage();
        List<OlPurchPaymentApproval> list = olPurchPaymentApprovalService.lambdaQuery()
                .and(w -> w.eq(StringUtils.isNotBlank(userId), OlPurchPaymentApproval::getMainManagerId, userId)
                        .or()
                        .eq(StringUtils.isNotBlank(userId), OlPurchPaymentApproval::getCoManagerId, userId)
                        .or()
                        .eq(StringUtils.isNotBlank(userId), OlPurchPaymentApproval::getCreaterId, userId)
                )


                .like(StringUtils.isNotBlank(olPurchPaymentApproval.getContractId()), OlPurchPaymentApproval::getContractId, olPurchPaymentApproval.getContractId())
                .like(StringUtils.isNotBlank(olPurchPaymentApproval.getExternalContractNbr()), OlPurchPaymentApproval::getExternalContractNbr, olPurchPaymentApproval.getExternalContractNbr())
                .like(StringUtils.isNotBlank(olPurchPaymentApproval.getProjectName()), OlPurchPaymentApproval::getProjectName, olPurchPaymentApproval.getProjectName())
                .eq(StringUtils.isNotBlank(olPurchPaymentApproval.getCurrencyCde()), OlPurchPaymentApproval::getCurrencyCde, olPurchPaymentApproval.getCurrencyCde())
                .eq(StringUtils.isNotBlank(olPurchPaymentApproval.getApproveStatus()), OlPurchPaymentApproval::getApproveStatus, olPurchPaymentApproval.getApproveStatus())
                .list();
        return ResponseEntity.success(getDataTable(list));
    }

    @TaskTime
    @PostMapping("/save")
    public ResponseEntity save(@RequestPart OlPurchPaymentApprovalDTO olPurchPaymentApproval, @RequestPart(required = false) List<MultipartFile> files) {
        String to = JacksonUtil.to(olPurchPaymentApproval);
        logger.info("req:{}", to);
        olPurchPaymentApprovalService.saveOlPurchPaymentApproval(olPurchPaymentApproval, files);
        return ResponseEntity.success("提交成功");

    }

}

