package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.CbaySysDict;
import com.lq.lidar.service.ICbaySysDictService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Arrays;
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
     * 字典新增
     *
     * @param cbaySysDict
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody @Valid CbaySysDict cbaySysDict) {
        // 重复添加判断
        // 更新
        if (StringUtils.isNotBlank(cbaySysDict.getDictId())) {
            CbaySysDict sysDictO = iCbaySysDictService.getById(cbaySysDict.getDictId());
            if (!sysDictO.getDictCd().equals(cbaySysDict.getDictCd())) {
                CbaySysDict sysDict = iCbaySysDictService.getDictTypeCdAndDictCd(cbaySysDict);
                Assert.isNull(sysDict, "该字典值已存在，请更换字典值重试！");
            }
            if (iCbaySysDictService.updateById(cbaySysDict)) {
                return ResponseEntity.success("修改成功");
            }
            return ResponseEntity.error("修改失败");
        }
        // 添加
        CbaySysDict sysDict = iCbaySysDictService.getDictTypeCdAndDictCd(cbaySysDict);
        Assert.isNull(sysDict, "该字典值已存在，不可重复添加！");
        if (iCbaySysDictService.save(cbaySysDict)) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 字典修改
     *
     * @param cbaySysDict
     * @return
     */
    @PutMapping("/edit")
    public ResponseEntity edit(@RequestBody @Valid CbaySysDict cbaySysDict) {
        if (iCbaySysDictService.updateById(cbaySysDict)) {
            return ResponseEntity.success("修改成功");
        }
        return ResponseEntity.error("修改失败");
    }

    /**
     * 根据字典值获取字典信息
     *
     * @param dictId
     * @return
     */
    @GetMapping("/getByDictId/{dictId}")
    public ResponseEntity getByDictId(@PathVariable String dictId) {
        CbaySysDict sysDict = iCbaySysDictService.getById(dictId);
        return ResponseEntity.success(sysDict);
    }

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

    /**
     * 字典值删除
     *
     * @param dictIds
     * @return
     */
    @DeleteMapping("/deleteByDictId/{dictIds}")
    public ResponseEntity deleteByDictId(@PathVariable String[] dictIds) {
        logger.info("dictIds:{}", dictIds.length);
        iCbaySysDictService.removeBatchByIds(Arrays.asList(dictIds));
        return ResponseEntity.success("删除成功");
    }
}

