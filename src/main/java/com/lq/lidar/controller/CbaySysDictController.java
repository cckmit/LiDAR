package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.entity.CbaySysDict;
import com.lq.lidar.service.ICbaySysDictService;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/system/cbaySysDict")
@CrossOrigin
public class CbaySysDictController extends BaseController {
    @Resource
    ICbaySysDictService iCbaySysDictService;

    @GetMapping("/list")
    public ResponseEntity list() {
        startPage();
        List<CbaySysDict> list = iCbaySysDictService.list();
        return ResponseEntity.success(getDataTable(list));
    }

    @GetMapping("/getByDictTypeCd/{dictTypeCd}")
    public ResponseEntity getByDictTypeCd(@PathVariable String dictTypeCd) {
        List<CbaySysDict> list = iCbaySysDictService.lambdaQuery().eq(CbaySysDict::getDictTypeCd,dictTypeCd).list();
        return ResponseEntity.success(list);
    }
}

