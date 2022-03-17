package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.core.page.TableDataInfo;
import com.lq.lidar.entity.CbaySysDict;
import com.lq.lidar.entity.CbaySysDictType;
import com.lq.lidar.service.ICbaySysDictTypeService;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@CrossOrigin
@RestController
@RequestMapping("/system/cbaySysDictType")
public class CbaySysDictTypeController extends BaseController {

    @Resource
    ICbaySysDictTypeService iCbaySysDictTypeService;

    @GetMapping("/list")
    public ResponseEntity list() {
        startPage();
        List<CbaySysDictType> list = iCbaySysDictTypeService.list();
        return ResponseEntity.success(getDataTable(list));
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody CbaySysDictType cbaySysDictType){
        iCbaySysDictTypeService.save(cbaySysDictType);
        return ResponseEntity.success("新增成功");
    }
}

