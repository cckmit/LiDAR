package com.lq.lidar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.lidar.entity.CbaySysDict;

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

    List<CbaySysDict> list(CbaySysDict sysDict);

}
