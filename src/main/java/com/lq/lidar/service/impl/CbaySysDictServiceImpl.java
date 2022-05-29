package com.lq.lidar.service.impl;


import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.lidar.common.constant.Constants;
import com.lq.lidar.common.utils.RedisJson;
import com.lq.lidar.common.utils.RedisUtils;
import com.lq.lidar.domain.entity.CbaySysDict;
import com.lq.lidar.mapper.CbaySysDictMapper;
import com.lq.lidar.service.ICbaySysDictService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.CommandArguments;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Protocol;
import redis.clients.jedis.UnifiedJedis;
import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.jedis.json.JsonSetParams;
import redis.clients.jedis.params.SetParams;
import redis.clients.jedis.providers.PooledConnectionProvider;

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
public class CbaySysDictServiceImpl extends ServiceImpl<CbaySysDictMapper, CbaySysDict> implements ICbaySysDictService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Autowired
    RedisUtils redisUtils;
    @Autowired
    RedisJson redisJson;
    @Override
    public List<CbaySysDict> list(CbaySysDict sysDict) {
        LambdaQueryChainWrapper<CbaySysDict> lambdaQuery = this.lambdaQuery();
        lambdaQuery.eq(StringUtils.isNotBlank(sysDict.getDictTypeCd()), CbaySysDict::getDictTypeCd, sysDict.getDictTypeCd());
        lambdaQuery.like(StringUtils.isNotBlank(sysDict.getDictCd()), CbaySysDict::getDictCd, sysDict.getDictCd());

        return lambdaQuery.list();
    }

    @Override
    public List<CbaySysDict> getByDictTypeCd(String dictTypeCd) {
        try {
            Boolean hasKey = redisUtils.hasKey(Constants.SYS_DICT_KEY + dictTypeCd);
            if (hasKey) {
                log.debug("从redis中获取字典数据，谢谢");
//                return redisUtils.getCacheObject(Constants.SYS_DICT_KEY + dictTypeCd);
                return redisJson.getClient().jsonGet(Constants.SYS_DICT_KEY + dictTypeCd,List.class);
            }
        } catch (Exception e) {
            log.error("redis读取字典异常:{}", ExceptionUtils.getStackTrace(e));
        }

        List<CbaySysDict> list = this.lambdaQuery().eq(CbaySysDict::getDictTypeCd, dictTypeCd).list();
        if (list.size() > 0) {
            try {
//                redisUtils.setCacheObject(Constants.SYS_DICT_KEY + dictTypeCd, list);
                redisJson.getClient().jsonSetWithEscape(Constants.SYS_DICT_KEY+ dictTypeCd,list);
            } catch (Exception e) {
                log.error("redis字典数据缓存失败:{}", ExceptionUtils.getStackTrace(e));
            }
            return list;
        }
        return null;
    }

    public CbaySysDict getDictTypeCdAndDictCd(CbaySysDict cbaySysDict) {
        CbaySysDict sysDict = this.lambdaQuery()
                .eq(CbaySysDict::getDictTypeCd, cbaySysDict.getDictTypeCd())
                .eq(CbaySysDict::getDictCd, cbaySysDict.getDictCd())
                .one();
        return sysDict;
    }

}
