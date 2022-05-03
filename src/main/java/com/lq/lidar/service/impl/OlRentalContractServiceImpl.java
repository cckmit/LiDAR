package com.lq.lidar.service.impl;


import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.lidar.entity.CbaySysOffice;
import com.lq.lidar.entity.CbaySysUser;
import com.lq.lidar.entity.OlRentalContract;
import com.lq.lidar.mapper.OlRentalContractMapper;
import com.lq.lidar.service.IOlRentalContractService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  租赁合同服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-04-19
 */
@Service
public class OlRentalContractServiceImpl extends ServiceImpl<OlRentalContractMapper, OlRentalContract> implements IOlRentalContractService {

    @Override
    public PageInfo<OlRentalContract> list(OlRentalContract rentalContract) {
        LambdaQueryChainWrapper<OlRentalContract> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(rentalContract.getContractId()), OlRentalContract::getContractId, rentalContract.getContractId());
        lambdaQuery.like(StringUtils.isNotBlank(rentalContract.getExternalContractNbr()), OlRentalContract::getExternalContractNbr, rentalContract.getExternalContractNbr());
        lambdaQuery.eq(StringUtils.isNotBlank(rentalContract.getContractStatus()),OlRentalContract::getContractStatus,rentalContract.getContractStatus());
        PageInfo<OlRentalContract> pageInfo = new PageInfo<>(lambdaQuery.list());
        return pageInfo;
    }
}
