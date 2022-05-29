package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.common.constant.Constants;
import com.lq.lidar.common.exception.ServiceException;
import com.lq.lidar.common.utils.RedisUtils;
import com.lq.lidar.domain.entity.CbaySysDict;
import com.lq.lidar.domain.entity.CbaySysDictType;
import com.lq.lidar.mapper.CbaySysDictMapper;
import com.lq.lidar.mapper.CbaySysDictTypeMapper;
import com.lq.lidar.service.ICbaySysDictTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * <p>
 * 字典类型服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@Service
public class CbaySysDictTypeServiceImpl extends ServiceImpl<CbaySysDictTypeMapper, CbaySysDictType> implements ICbaySysDictTypeService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Resource
    CbaySysDictMapper cbaySysDictMapper;
    @Resource
    CbaySysDictServiceImpl cbaySysDictService;

    @Resource
    RedisUtils redisUtils;

    @Override
    public void deleteByDictTypeCd(String[] dictCds) {
        Arrays.stream(dictCds).forEach(dictCd -> {
            Long count = cbaySysDictService.lambdaQuery().eq(CbaySysDict::getDictTypeCd, dictCd).count();
            if (count > 0) {
                throw new ServiceException("该字典已分配数据，不可删除！");
            }
            this.removeById(dictCd);
            redisUtils.deleteObject(Constants.SYS_DICT_KEY + dictCd);
        });
    }
}
