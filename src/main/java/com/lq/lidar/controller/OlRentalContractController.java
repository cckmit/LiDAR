package com.lq.lidar.controller;


import com.github.pagehelper.PageInfo;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.OlRentalContract;
import com.lq.lidar.service.IOlRentalContractService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  租赁合同
 * </p>
 *
 * @author LQ
 * @since 2022-04-19
 */
@RestController
@RequestMapping("/contract/olRentalContract")
@CrossOrigin
public class OlRentalContractController extends BaseController {

    @Resource
    IOlRentalContractService olRentalContractService;

    /**
     * 租赁合同数据分页条件查询
     *
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity list(OlRentalContract olRentalContract) {
        startPage();
        PageInfo<OlRentalContract> list = olRentalContractService.list(olRentalContract);
        return ResponseEntity.success(getDataTable(list));
    }
}

