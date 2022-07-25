package com.rjxy.pattern.factory.application.old;

import com.rjxy.pattern.factory.redis.RedisUtils;
import com.rjxy.pattern.factory.redis.cluster.EGM;
import com.rjxy.pattern.factory.redis.cluster.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @Description CacheServiceImpl 升级后，使用多套Redis集群服务，同时兼容以前单体Redis服务
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:08
 * @Version 0.1
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIR iir = new IIR();

    @Override
    public String get(String key, int redisType) {

        if (1 == redisType) {
            return egm.gain(key);
        }

        if (2 == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {

        if (1 == redisType) {
            egm.set(key, value);
            return;
        }

        if (2 == redisType) {
            iir.set(key, value);
            return;
        }

        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {

        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        }

        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {

        if (1 == redisType) {
            egm.delete(key);
            return;
        }

        if (2 == redisType) {
            iir.del(key);
            return;
        }

        redisUtils.del(key);
    }
}
