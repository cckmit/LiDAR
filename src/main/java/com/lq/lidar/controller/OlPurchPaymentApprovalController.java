package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.domain.dto.OlPurchPaymentApprovalDTO;
import com.lq.lidar.domain.entity.OlPurchPaymentApproval;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
    @Value("${upload.path}")
    private String uploadPath;

    @PostMapping("/save")
    public void save(@RequestPart OlPurchPaymentApprovalDTO olPurchPaymentApproval, MultipartFile files){
        logger.info("11111111");
        String uuid = UUID.randomUUID().toString();
        if (null!=files){
            String filepath = uploadPath + files.getOriginalFilename();
            File file = new File(filepath);
            try {
//                files.transferTo(file);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

}

