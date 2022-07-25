package com.rjxy.pattern.factory.application.fresh.facotry;

import com.rjxy.pattern.factory.application.fresh.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description JDKProxyFactory
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:22
 * @Version 0.1
 */
public class JDKProxyFactory {
    public static <T> T getProxy(Class<T> cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKProxyFactoryHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClazz}, handler);
    }
}
