package com.lq.lidar.common.utils;

import com.lq.lidar.domain.entity.CbaySysDict;
import com.lq.lidar.service.ICbaySysDictService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 数据字典转换
 */
@Component
public class DictConvert {
    @Resource
    ICbaySysDictService iCbaySysDictService;


    /**
     * 根据字典值获取字典描述
     * @param dictId
     * @return
     */
    public String DictValueToLabel(String dictId) {
        CbaySysDict cbaySysDict = iCbaySysDictService.getById(dictId);
        if (null != cbaySysDict) {
            return cbaySysDict.getDictCnDesc();
        }
        return null;
    }
}
