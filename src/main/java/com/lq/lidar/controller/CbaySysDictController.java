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
 * 字典数据前端控制器
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


    /**
     * 字典数据分页条件查询
     *
     * @param cbaySysDict 查询条件
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity list(CbaySysDict cbaySysDict) {
        startPage();
        List<CbaySysDict> list = iCbaySysDictService.list(cbaySysDict);
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 根据字典类型id获取字典数据
     *
     * @param dictTypeCd 字典类型id
     * @return
     */
    @GetMapping("/getByDictTypeCd/{dictTypeCd}")
    public ResponseEntity getByDictTypeCd(@PathVariable String dictTypeCd) {
        List<CbaySysDict> list = iCbaySysDictService.getByDictTypeCd(dictTypeCd);
        return ResponseEntity.success(list);
    }
}

