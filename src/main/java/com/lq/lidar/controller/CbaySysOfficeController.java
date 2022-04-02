package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.utils.DataConvert;
import com.lq.lidar.entity.CbaySysOffice;
import com.lq.lidar.service.ICbaySysOfficeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-03-16
 */
@RestController
@RequestMapping("/system/cbaySysOffice")
public class CbaySysOfficeController extends BaseController {
    @Resource
    ICbaySysOfficeService cbaySysOfficeService;

    @GetMapping("/getByOfcTypeCd/{ofcTypeCd}")
    public List getByOfcTypeCd(@PathVariable String ofcTypeCd) {
        List<CbaySysOffice> cbaySysOffices = cbaySysOfficeService.lambdaQuery().eq(CbaySysOffice::getOfcTypeCd, ofcTypeCd).list();
        List list = DataConvert.ListToLV(cbaySysOffices,CbaySysOffice::getOfcNm,CbaySysOffice::getOfcId);
        return list;
    }
}

