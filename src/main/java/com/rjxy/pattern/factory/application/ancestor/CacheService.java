package com.rjxy.pattern.factory.application.ancestor;

import java.util.concurrent.TimeUnit;

/**
 * @Description CacheService
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:03
 * @Version 0.1
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
