package com.lq.lidar.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.domain.dto.OlPurchPaymentApprovalDTO;
import com.lq.lidar.domain.entity.OlPurchPaymentApproval;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  采购付款审批服务类
 * </p>
 *
 * @author LQ
 * @since 2022-06-13
 */
public interface IOlPurchPaymentApprovalService extends IService<OlPurchPaymentApproval> {

    public void  saveOlPurchPaymentApproval(OlPurchPaymentApprovalDTO olPurchPaymentApprovalDTO, List<MultipartFile> files);
}
