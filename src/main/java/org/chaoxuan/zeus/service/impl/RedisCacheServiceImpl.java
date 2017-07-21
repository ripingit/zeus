package org.chaoxuan.zeus.service.impl;

import org.chaoxuan.service.RedisService;
import org.chaoxuan.zeus.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
@Service
public class RedisCacheServiceImpl implements RedisCacheService {
    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public <T> ListOperations<String, T> setCacheList(String key, List<T> dataList,Long hour) {
        redisTemplate.delete(key);
        ListOperations listOperation = redisTemplate.opsForList();
        if(null != dataList)
        {
            int size = dataList.size();
            for(int i = 0; i < size ; i ++)
            {

                listOperation.rightPush(key,dataList.get(i));
            }
        }
        //设置过期时间
        redisTemplate.expire(key,hour,TimeUnit.HOURS);
        return listOperation;
    }

    @Override
    public <T> List<T> getCacheList(String key) {
        List<T> dataList = new ArrayList<T>();
        ListOperations<String,T> listOperation = redisTemplate.opsForList();
        Long size = listOperation.size(key);

        for(int i = 0 ; i < size ; i ++)
        {
            dataList.add((T) listOperation.leftPop(key));
        }

        return dataList;
    }
}
