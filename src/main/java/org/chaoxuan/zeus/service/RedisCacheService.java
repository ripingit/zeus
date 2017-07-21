package org.chaoxuan.zeus.service;

import org.springframework.data.redis.core.ListOperations;

import java.util.List;

/**
 * Created by Administrator on 2017/7/6 0006.
 */
public interface RedisCacheService {
    <T> ListOperations<String, T> setCacheList(String key, List<T> dataList,Long hour);
    <T> List<T> getCacheList(String key);

}
