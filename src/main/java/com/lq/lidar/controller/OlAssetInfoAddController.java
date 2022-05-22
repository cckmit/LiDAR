package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.entity.CbaySysDictType;
import com.lq.lidar.entity.OlAssetInfoAdd;
import com.lq.lidar.service.IOlAssetInfoAddService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 租赁物前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-05-21
 */
@RestController
@RequestMapping("/asset/olAssetInfoAdd")
@CrossOrigin
public class OlAssetInfoAddController extends BaseController {

    @Resource
    IOlAssetInfoAddService assetInfoAddService;

    /**
     * 租赁物信息分页列表查询
     *
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity list(OlAssetInfoAdd assetInfoAdd) {
        startPage();
        List<OlAssetInfoAdd> list = assetInfoAddService.lambdaQuery().like(StringUtils.isNotBlank(assetInfoAdd.getAssetNo()),OlAssetInfoAdd::getAssetNo, assetInfoAdd.getAssetNo()).list();
        return ResponseEntity.success(getDataTable(list));
    }

}

