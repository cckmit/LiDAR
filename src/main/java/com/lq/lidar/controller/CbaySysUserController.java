package com.lq.lidar.controller;


import com.github.pagehelper.PageInfo;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.entity.CbaySysUser;
import com.lq.lidar.service.ICbaySysUserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
        PageInfo<CbaySysUser> pageInfo = iCbaySysUserService.list(sysUser);
        return ResponseEntity.success(getDataTable(pageInfo));
    }
    /**
     * 添加用户
     *
     * @param sysUser 用户
     */
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody @Validated CbaySysUser sysUser) {
        boolean save = iCbaySysUserService.save(sysUser);
        if (save){
            return ResponseEntity.success("添加成功");
        }
        return ResponseEntity.error("添加失败");
    }

    /**
     * 通过userId获取用户信息
     * @param userId
     * @return
     */
    @GetMapping("/getByUserId/{userId}")
    public ResponseEntity getByUserId(@PathVariable("userId") String userId) {
        return ResponseEntity.success(iCbaySysUserService.getById(userId));
    }
    // 用户启用禁用
    @PostMapping("/updateStatus")
    public ResponseEntity updateStatus(@RequestBody CbaySysUser sysUser) {
        boolean update = iCbaySysUserService.updateById(sysUser);
        if (update){
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

}

