package com.lq.lidar.controller;


import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.entity.SysOperLog;
import com.lq.lidar.service.ISysOperLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 操作日志记录 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-06-23
 */
@RestController
@CrossOrigin
@RequestMapping("/system/sysOperLog")
public class SysOperLogController extends BaseController {

    @Resource
    ISysOperLogService sysOperLogService;

    /**
     * 操作日志列表
     *
     * @param sysOperLog 操作日志
     * @return 操作日志分页列表数据
     */
    @GetMapping("/list")
    public ResponseEntity list(SysOperLog sysOperLog) {
        startPage();
        List<SysOperLog> list = sysOperLogService.lambdaQuery().eq(null != sysOperLog.getBusinessType(), SysOperLog::getBusinessType, sysOperLog.getBusinessType()).list();
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 获取日志详情
     *
     * @param operId
     * @return
     */
    @GetMapping("/get/{operId}")
    public ResponseEntity get(@PathVariable String operId) {
        SysOperLog sysOperLog = sysOperLogService.getById(operId);
        return ResponseEntity.success(sysOperLog);
    }

    @DeleteMapping("/delete/{operId}")
    public ResponseEntity del(@PathVariable String operId) {
        sysOperLogService.removeById(operId);
        return ResponseEntity.success("删除成功");
    }



}

