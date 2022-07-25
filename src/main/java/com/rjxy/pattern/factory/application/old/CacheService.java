package com.rjxy.pattern.factory.application.old;

import java.util.concurrent.TimeUnit;

/**
 * @Description CacheService
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:12
 * @Version 0.1
 */
public interface CacheService {
    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
