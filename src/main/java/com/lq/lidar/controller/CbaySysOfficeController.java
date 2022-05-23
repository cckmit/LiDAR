package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.utils.DataConvert;
import com.lq.lidar.domain.entity.CbaySysOffice;
import com.lq.lidar.service.ICbaySysOfficeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 机构前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-03-16
 */
@RestController
@CrossOrigin
@RequestMapping("/system/cbaySysOffice")
public class CbaySysOfficeController extends BaseController {
    @Resource
    ICbaySysOfficeService cbaySysOfficeService;

    /**
     * 根据机构类型id查询机构数据
     *
     * @param ofcTypeCd 机构类型
     * @return
     */
    @GetMapping("/getByOfcTypeCd/{ofcTypeCd}")
    public ResponseEntity getByOfcTypeCd(@PathVariable String ofcTypeCd) {
        List<CbaySysOffice> cbaySysOffices = cbaySysOfficeService.lambdaQuery().eq(CbaySysOffice::getOfcTypeCd, ofcTypeCd).list();
        List list = DataConvert.ListToLV(cbaySysOffices, CbaySysOffice::getOfcNm, CbaySysOffice::getOfcId);
        return ResponseEntity.success(list);
    }

    /**
     * 根据机构级别查询机构信息
     *
     * @param ofcGrdCd 机构级别
     * @return
     */
    @GetMapping("/getByOfcGrdCd/{ofcGrdCd}")
    public ResponseEntity getByOfcGrdCd(@PathVariable String ofcGrdCd) {
        List<CbaySysOffice> cbaySysOffices = cbaySysOfficeService.lambdaQuery().eq(CbaySysOffice::getOfcGrdCd, ofcGrdCd).list();
        List list = DataConvert.ListToLV(cbaySysOffices, CbaySysOffice::getOfcNm, CbaySysOffice::getOfcId);
        return ResponseEntity.success(list);
    }

    /**
     * 通过部门查询中心名称
     *
     * @param ofcId
     * @return
     */
    @GetMapping("/getByOfcPrtId/{ofcId}")
    public ResponseEntity getByOfcPrtId(@PathVariable String ofcId) {
        List<CbaySysOffice> cbaySysOffices = cbaySysOfficeService.lambdaQuery().eq(CbaySysOffice::getOfcPrtId, ofcId).list();
        List list = DataConvert.ListToLV(cbaySysOffices, CbaySysOffice::getOfcNm, CbaySysOffice::getOfcId);
        return ResponseEntity.success(list);
    }
}

