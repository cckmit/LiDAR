package com.lq.lidar.service;

import com.lq.lidar.entity.CbaySysDictType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
public interface ICbaySysDictTypeService extends IService<CbaySysDictType> {

    void deleteByDictTypeCd(String[] dictCds);
}
