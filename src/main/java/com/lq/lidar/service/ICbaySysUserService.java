package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.lidar.domain.entity.CbaySysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
public interface ICbaySysUserService extends IService<CbaySysUser> {
    PageInfo<CbaySysUser> list(CbaySysUser sysUser);

    CbaySysUser getByUserId(String userId);
}
