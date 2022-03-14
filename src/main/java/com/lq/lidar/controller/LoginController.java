package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.common.core.page.TableDataInfo;
import com.lq.lidar.entity.CbaySysUser;
import com.lq.lidar.service.ICbaySysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
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
@RequestMapping
@CrossOrigin
public class LoginController extends BaseController {

    @GetMapping("/admin_info")
    public ResponseEntity list() {
        return ResponseEntity.success();
    }
    @PostMapping("/login")
    public ResponseEntity login() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("token","YNGLLXRTSLKBMHXRVUIPKBWIYDPGJQMV");

        return ResponseEntity.success(map);
    }
}

