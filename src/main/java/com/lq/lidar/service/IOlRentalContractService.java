package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.lidar.domain.entity.OlRentalContract;

/**
 * <p>
 *  租赁合同服务类
 * </p>
 *
 * @author LQ
 * @since 2022-04-19
 */
public interface IOlRentalContractService extends IService<OlRentalContract> {
    PageInfo<OlRentalContract> list(OlRentalContract rentalContract);


}
