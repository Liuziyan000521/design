package com.rjxy.pattern.factory.application.fresh.workshop.impl;

import com.rjxy.pattern.factory.application.fresh.workshop.ICacheAdapter;
import com.rjxy.pattern.factory.redis.cluster.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @Description EGMCacheAdapter
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:19
 * @Version 0.1
 */
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM emg = new EGM();

    @Override
    public String get(String key) {
        return emg.gain(key);
    }

    @Override
    public void set(String key, String value) {
        emg.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        emg.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        emg.delete(key);
    }
}
