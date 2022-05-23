package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.domain.entity.CbaySysDict;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
public interface ICbaySysDictService extends IService<CbaySysDict> {

    /**
     * 查询字典数据
     *
     * @param sysDict 查询条件
     * @return
     */
    List<CbaySysDict> list(CbaySysDict sysDict);

    /**
     * 根据字典类型id获取字典数据
     *
     * @param dictTypeCd 字典类型id
     * @return
     */
    List<CbaySysDict> getByDictTypeCd(String dictTypeCd);


    CbaySysDict getDictTypeCdAndDictCd(CbaySysDict sysDict);
}
