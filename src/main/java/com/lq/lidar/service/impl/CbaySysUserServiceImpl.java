package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.lq.lidar.entity.CbaySysUser;
import com.lq.lidar.mapper.CbaySysUserMapper;
import com.lq.lidar.service.ICbaySysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@Service
public class CbaySysUserServiceImpl extends ServiceImpl<CbaySysUserMapper, CbaySysUser> implements ICbaySysUserService {

    @Override
    public List<CbaySysUser> list(CbaySysUser sysUser) {
        LambdaQueryChainWrapper<CbaySysUser> lambdaQuery = this.lambdaQuery();
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getUserNm()), CbaySysUser::getUserNm, sysUser.getUserNm());
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getUserNm()), CbaySysUser::getUserNm, sysUser.getUserNm());

        return lambdaQuery.list();
    }
}
