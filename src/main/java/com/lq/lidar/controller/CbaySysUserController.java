package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.core.page.TableDataInfo;
import com.lq.lidar.entity.CbaySysDict;
import com.lq.lidar.entity.CbaySysUser;
import com.lq.lidar.service.ICbaySysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  用户管理前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@RestController
@RequestMapping("/system/cbaySysUser")
@CrossOrigin
public class CbaySysUserController extends BaseController {

    @Resource
    ICbaySysUserService iCbaySysUserService;

    @GetMapping("/list")
    public ResponseEntity list(CbaySysUser sysUser) {
        startPage();
        List<CbaySysUser> list = iCbaySysUserService.list(sysUser);
        return ResponseEntity.success(getDataTable(list));
    }
}

