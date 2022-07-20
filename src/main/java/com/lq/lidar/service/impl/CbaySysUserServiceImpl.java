package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.lidar.domain.entity.CbaySysOffice;
import com.lq.lidar.domain.entity.CbaySysUser;
import com.lq.lidar.mapper.CbaySysOfficeMapper;
import com.lq.lidar.mapper.CbaySysUserMapper;
import com.lq.lidar.service.ICbaySysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

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

    @Resource
    CbaySysOfficeMapper sysOfficeMapper;

    @Override
    public PageInfo<CbaySysUser> list(CbaySysUser sysUser) {
        LambdaQueryChainWrapper<CbaySysUser> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysUser.getUserNm()), CbaySysUser::getUserNm, sysUser.getUserNm());
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getValidInd()), CbaySysUser::getValidInd, sysUser.getValidInd());
        PageInfo<CbaySysUser> pageInfo = new PageInfo<>(lambdaQuery.list());
        List<CbaySysUser> collect = pageInfo.getList().stream().map(cbaySysUser -> CompletableFuture.supplyAsync(() -> {
            CbaySysOffice ofc = sysOfficeMapper.selectById(cbaySysUser.getOfcId());
            CbaySysOffice dep = sysOfficeMapper.selectById(cbaySysUser.getDepId());
            cbaySysUser.setOfc(ofc);
            cbaySysUser.setDep(dep);
            return cbaySysUser;
        })).collect(Collectors.toList()).stream().map(CompletableFuture::join).collect(Collectors.toList());
        pageInfo.setList(collect);

        return pageInfo;
    }

    @Override
    @Cacheable(cacheNames = {"sysUser"},key = "#userId")
    public CbaySysUser getByUserId(String userId) {
        return this.getById(userId);
    }
}
