package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.lidar.common.core.page.PageDomain;
import com.lq.lidar.common.core.page.TableDataInfo;
import com.lq.lidar.entity.CbaySysUser;

import java.util.List;

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
}
