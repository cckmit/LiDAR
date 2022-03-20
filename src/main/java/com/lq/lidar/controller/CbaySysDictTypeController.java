package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.entity.CbaySysDictType;
import com.lq.lidar.service.ICbaySysDictTypeService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 前端控制器
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
    public ResponseEntity add(@RequestBody @Valid CbaySysDictType cbaySysDictType) {
        CbaySysDictType sysDictType = iCbaySysDictTypeService.getById(cbaySysDictType.getDictTypeCd());
        Assert.isNull(sysDictType, "该字典类型已存在，不可重复添加！");
        if (iCbaySysDictTypeService.save(cbaySysDictType)) {
            return   ResponseEntity.success("新增成功");
        }
        return ResponseEntity.error("新增失败");
    }

    @DeleteMapping("/delete/{dictCodes}")
    public ResponseEntity delete(@PathVariable String[] dictCodes){
        logger.error("dictCodes:{}",dictCodes.length);
        return ResponseEntity.success("删除成功");
    }
}

