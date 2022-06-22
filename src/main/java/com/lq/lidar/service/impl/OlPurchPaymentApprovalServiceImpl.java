package com.lq.lidar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.lq.lidar.common.utils.DictConvert;
import com.lq.lidar.domain.dto.OlPurchPaymentApprovalDTO;
import com.lq.lidar.domain.entity.OlPurchPaymentApplyAsset;
import com.lq.lidar.domain.entity.OlPurchPaymentApproval;
import com.lq.lidar.domain.entity.OlPurchPaymentExtra;
import com.lq.lidar.mapper.OlPurchPaymentApprovalMapper;
import com.lq.lidar.service.IOlPurchPaymentApplyAssetService;
import com.lq.lidar.service.IOlPurchPaymentApprovalService;
import com.lq.lidar.service.IOlPurchPaymentExtraService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
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
    private IOlPurchPaymentApplyAssetService olPurchPaymentApplyAssetService;
    @Resource
    CommonService commonService;

    @Resource
    DictConvert dictConvert;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveOlPurchPaymentApproval(OlPurchPaymentApprovalDTO olPurchPaymentApprovalDTO, List<MultipartFile> files) {
        // 申请单
        OlPurchPaymentApproval olPurchPaymentApproval = olPurchPaymentApprovalDTO.getOlPurchPaymentApproval();
        this.saveOrUpdate(olPurchPaymentApproval);

        if (CollectionUtils.isNotEmpty(olPurchPaymentApproval.getOtherAssetInfoAddSeqno())) {
            List<String> assetInfoAddSeqnos = olPurchPaymentApproval.getOtherAssetInfoAddSeqno();
            assetInfoAddSeqnos.forEach(assetInfoAddSeqno -> {
                OlPurchPaymentApplyAsset olPurchPaymentApplyAsset = new OlPurchPaymentApplyAsset();
                olPurchPaymentApplyAsset.setApplySeqno(olPurchPaymentApproval.getSeqno());
                olPurchPaymentApplyAsset.setContractId(olPurchPaymentApproval.getContractId());
                olPurchPaymentApplyAsset.setExternalContractNbr(olPurchPaymentApproval.getExternalContractNbr());
                olPurchPaymentApplyAsset.setContractSeqno(olPurchPaymentApproval.getContractSeqno());
                olPurchPaymentApplyAsset.setAssetInfoAddSeqno(assetInfoAddSeqno);
                olPurchPaymentApplyAssetService.save(olPurchPaymentApplyAsset);
            });
        }

        List<OlPurchPaymentExtra> olPurchPaymentExtras = olPurchPaymentApprovalDTO.getOlPurchPaymentExtraList();

        StringBuilder payAddInfoStr = new StringBuilder();
        for (OlPurchPaymentExtra olPurchPaymentExtra : olPurchPaymentExtras) {
            List<String> payAddInfo = Lists.newArrayListWithCapacity(8);
            //付款方向
            if (StringUtils.isNotBlank(dictConvert.DictValueToLabel(olPurchPaymentExtra.getReceivePayDir()))) {
                payAddInfo.add(dictConvert.DictValueToLabel(olPurchPaymentExtra.getReceivePayDir()));
            }
            //收付说明
            if (StringUtils.isNotBlank(olPurchPaymentExtra.getReceivePayDesc())) {
                payAddInfo.add(olPurchPaymentExtra.getReceivePayDesc());
            }
            //币种
            if (StringUtils.isNotBlank(dictConvert.DictValueToLabel(olPurchPaymentExtra.getCurrencyCde()))) {
                payAddInfo.add(dictConvert.DictValueToLabel(olPurchPaymentExtra.getCurrencyCde()));
            }
            //金额
            if (null != olPurchPaymentExtra.getAmt()) {
                payAddInfo.add(olPurchPaymentExtra.getAmt().toPlainString());//金额
            }
            payAddInfo.add("<br/>");
            String join = StringUtils.join(payAddInfo, "-");
            logger.info("附加采购明细:{}", join);
            payAddInfoStr.append(join);
            olPurchPaymentExtra.setContractId(olPurchPaymentApproval.getContractId());
            olPurchPaymentExtra.setExternalContractNbr(olPurchPaymentApproval.getExternalContractNbr());
            olPurchPaymentExtra.setContractSeqno(olPurchPaymentApproval.getContractSeqno());
            olPurchPaymentExtra.setApplySeqno(olPurchPaymentApproval.getSeqno());
        }
        olPurchPaymentExtraService.saveOrUpdateBatch(olPurchPaymentExtras);
        olPurchPaymentApproval.setPayAddInfo(payAddInfoStr.toString());
        this.saveOrUpdate(olPurchPaymentApproval);
        // 采购明细
        logger.debug("数据入库完毕，准备上传文件了");
        // 文件上传
        commonService.uploadFiles(files);
    }
}
