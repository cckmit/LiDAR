package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.entity.CbaySysDict;
import com.lq.lidar.entity.OlRentalContract;
import com.lq.lidar.service.IOlRentalContractService;
import com.lq.lidar.service.impl.OlRentalContractServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    public ResponseEntity list() {
        startPage();
        List<OlRentalContract> list = olRentalContractService.list();
        return ResponseEntity.success(getDataTable(list));
    }
}

