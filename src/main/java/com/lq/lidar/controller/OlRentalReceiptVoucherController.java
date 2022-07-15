package com.lq.lidar.controller;


import com.github.pagehelper.PageInfo;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.OlRentalContract;
import com.lq.lidar.domain.entity.OlRentalReceiptVoucher;
import com.lq.lidar.service.IOlRentalReceiptVoucherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  收款单前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-07-14
 */
@RestController
@RequestMapping("/system/olRentalReceiptVoucher")
public class OlRentalReceiptVoucherController extends BaseController {

    @Resource
    IOlRentalReceiptVoucherService olRentalReceiptVoucherService;

    @GetMapping("/list")
    public ResponseEntity list(OlRentalReceiptVoucher olRentalReceiptVoucher) {
        startPage();
        List<OlRentalReceiptVoucher> list = olRentalReceiptVoucherService.lambdaQuery()
                .orderByDesc(OlRentalReceiptVoucher::getArriveDate)
                .orderByDesc(OlRentalReceiptVoucher::getSeqno)
                .list();
        return ResponseEntity.success(getDataTable(list));
    }
}

