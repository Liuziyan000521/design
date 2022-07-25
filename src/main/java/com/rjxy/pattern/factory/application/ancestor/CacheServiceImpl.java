package com.rjxy.pattern.factory.application.ancestor;

import com.rjxy.pattern.factory.redis.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Description CacheServiceImpl
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:08
 * @Version 0.1
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    @Override

    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
