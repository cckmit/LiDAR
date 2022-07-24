package com.lq.lidar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.common.enums.OlStatusCode;
import com.lq.lidar.common.exception.ServiceException;
import com.lq.lidar.domain.entity.CbayBpBizPtnrBase;
import com.lq.lidar.domain.entity.OlRentalReceiptVoucher;

import com.lq.lidar.mapper.CbayBpBizPtnrBaseMapper;
import com.lq.lidar.mapper.OlRentalReceiptVoucherMapper;
import com.lq.lidar.service.IOlRentalReceiptVoucherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * <p>
 *  收款单服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-07-14
 */
@Service
public class OlRentalReceiptVoucherServiceImpl extends ServiceImpl<OlRentalReceiptVoucherMapper, OlRentalReceiptVoucher> implements IOlRentalReceiptVoucherService {
    @Resource
    CbayBpBizPtnrBaseMapper cbayBpBizPtnrBaseMapper;

    @Override
    public boolean saveReceiptVoucher(OlRentalReceiptVoucher olRentalReceiptVoucher) {
        if (olRentalReceiptVoucher.getWriteOffAmt().compareTo(olRentalReceiptVoucher.getActAmt()) < BigDecimal.ZERO.intValue()){
            throw new ServiceException("应核销金额不得小于实际收款金额");
        }
        CbayBpBizPtnrBase cbayBpBizPtnrBase = cbayBpBizPtnrBaseMapper.selectById(olRentalReceiptVoucher.getPayerId());



        olRentalReceiptVoucher.setWriteOffStatus(OlStatusCode.WRITE_OFF_STATUS_NOT_WRITE_OFF.getCode());
        olRentalReceiptVoucher.setIsDepositDeduct(OlStatusCode.NO.getCode());
        olRentalReceiptVoucher.setIsTempSave(OlStatusCode.NO.getCode());
        olRentalReceiptVoucher.setIsPaymentOnCredit(OlStatusCode.NO.getCode());

        boolean save = this.save(olRentalReceiptVoucher);
        return save;
    }
}
