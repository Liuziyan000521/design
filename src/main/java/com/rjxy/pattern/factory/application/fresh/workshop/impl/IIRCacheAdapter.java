package com.rjxy.pattern.factory.application.fresh.workshop.impl;

import com.rjxy.pattern.factory.application.fresh.workshop.ICacheAdapter;
import com.rjxy.pattern.factory.redis.cluster.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @Description IIRCacheAdapter
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:16
 * @Version 0.1
 */
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);

    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
