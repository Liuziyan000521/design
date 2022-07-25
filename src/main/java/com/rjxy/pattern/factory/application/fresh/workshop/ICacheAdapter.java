package com.rjxy.pattern.factory.application.fresh.workshop;

import java.util.concurrent.TimeUnit;

/**
 * @Description ICacheAdapter
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:15
 * @Version 0.1
 */
public interface ICacheAdapter {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
