package com.lq.lidar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.domain.dto.OlPurchPaymentApprovalDTO;
import com.lq.lidar.domain.entity.OlPurchPaymentApproval;
import com.lq.lidar.mapper.OlPurchPaymentApprovalMapper;
import com.lq.lidar.service.IOlPurchPaymentApprovalService;
import com.lq.lidar.service.IOlPurchPaymentExtraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-06-13
 */
@Service
public class OlPurchPaymentApprovalServiceImpl extends ServiceImpl<OlPurchPaymentApprovalMapper, OlPurchPaymentApproval> implements IOlPurchPaymentApprovalService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IOlPurchPaymentExtraService olPurchPaymentExtraService;
    @Resource
    CommonService commonService;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveOlPurchPaymentApproval(OlPurchPaymentApprovalDTO olPurchPaymentApprovalDTO, List<MultipartFile> files) {
        this.saveOrUpdate(olPurchPaymentApprovalDTO.getOlPurchPaymentApproval());
        olPurchPaymentExtraService.saveOrUpdateBatch(olPurchPaymentApprovalDTO.getOlPurchPaymentExtraList());
        logger.debug("数据入库完毕，准备上传文件了");
        commonService.uploadFiles(files);
    }
}
