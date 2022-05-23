package com.lq.lidar.controller;


import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.utils.DataConvert;
import com.lq.lidar.domain.entity.OlSysCategory;
import com.lq.lidar.service.IOlSysCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 字典层级前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-05-06
 */
@RestController
@RequestMapping("/system/olSysCategory")
@CrossOrigin
public class OlSysCategoryController {
    @Resource
    IOlSysCategoryService olSysCategoryService;

    /**
     * 查询产品层级关系
     *
     * @param parentCode
     * @return
     */
    @GetMapping("/getByParentCode/{parentCode}")
    public ResponseEntity getByParentCode(@PathVariable String parentCode) {
        List<OlSysCategory> cbaySysOffices = olSysCategoryService.lambdaQuery().eq(OlSysCategory::getParentCode, parentCode).list();
        List list = DataConvert.ListToLV(cbaySysOffices, OlSysCategory::getCategoryName, OlSysCategory::getCategoryCode);
        return ResponseEntity.success(list);
    }
}

