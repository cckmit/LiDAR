package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.github.pagehelper.PageInfo;
import com.lq.lidar.common.core.page.TableDataInfo;
import com.lq.lidar.entity.CbaySysOffice;
import com.lq.lidar.entity.CbaySysUser;
import com.lq.lidar.mapper.CbaySysOfficeMapper;
import com.lq.lidar.mapper.CbaySysUserMapper;
import com.lq.lidar.service.ICbaySysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.lq.lidar.common.utils.PageUtils.startPage;

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
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getValidInd()),CbaySysUser::getValidInd,sysUser.getValidInd());
        PageInfo<CbaySysUser> pageInfo = new PageInfo<>(lambdaQuery.list());

        List<CbaySysUser> collect = pageInfo.getList().stream().map(cbaySysUser -> {
            CbaySysOffice ofc = sysOfficeMapper.selectById(cbaySysUser.getOfcId());
            CbaySysOffice dep = sysOfficeMapper.selectById(cbaySysUser.getDepId());
            cbaySysUser.setOfc(ofc);
            cbaySysUser.setDep(dep);
            return cbaySysUser;
        }).collect(Collectors.toList());
        pageInfo.setList(collect);
        return pageInfo;
    }
}
