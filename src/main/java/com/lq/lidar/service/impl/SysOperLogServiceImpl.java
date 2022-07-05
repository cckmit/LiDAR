package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.domain.entity.SysOperLog;
import com.lq.lidar.mapper.SysOperLogMapper;
import com.lq.lidar.service.ISysOperLogService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-06-23
 */
@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog> implements ISysOperLogService {

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveBySysOperLog(SysOperLog sysOperLog) {
        this.save(sysOperLog);
    }
}
