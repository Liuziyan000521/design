package com.rjxy.simpleFactory;

import com.rjxy.pattern.factory.application.ancestor.CacheService;
import com.rjxy.pattern.factory.application.fresh.facotry.JDKProxyFactory;
import com.rjxy.pattern.factory.application.fresh.workshop.impl.EGMCacheAdapter;
import com.rjxy.pattern.factory.application.fresh.workshop.impl.IIRCacheAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description FactoryDemo
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:27
 * @Version 0.1
 */
public class FactoryDemo {
    private static final Logger log = LoggerFactory.getLogger(FactoryDemo.class);

    public static void main(String[] args) throws Exception {
        CacheService proxy_EMG = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EMG.set("user_name", "小牛马");
        String val01 = proxy_EMG.get("user_name");
        log.info("缓存服务 EGM 测试 测试结果：{}", val01);

        CacheService proxy_IIR = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name2", "小牛马");
        String val02 = proxy_IIR.get("user_name2");
        log.info("缓存服务 IIR 测试 测试结果：{}", val02);
    }
}
