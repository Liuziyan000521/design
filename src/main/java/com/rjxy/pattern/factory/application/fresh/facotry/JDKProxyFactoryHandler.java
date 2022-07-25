package com.rjxy.pattern.factory.application.fresh.facotry;

import com.rjxy.pattern.factory.application.fresh.utils.ClassLoaderUtils;
import com.rjxy.pattern.factory.application.fresh.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description JDKProxyFactoryHandler
 * @Author 蜻蜓队长
 * @Date 2022/7/25 22:22
 * @Version 0.1
 */
public class JDKProxyFactoryHandler implements InvocationHandler {
    private ICacheAdapter cacheAdapter;

    public JDKProxyFactoryHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return cacheAdapter
                .getClass()
                .getMethod(method.getName(),
                        ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}
