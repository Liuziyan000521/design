package com.rjxy.single.impl;

import com.rjxy.single.IVideoUserServer;

/**
 * @Description OrdinaryVideoUserServer 普通用户
 * @Author 蜻蜓队长
 * @Date 2022/7/23 20:58
 * @Version 0.1
 */
public class OrdinaryVideoUserServer implements IVideoUserServer {
    @Override
    public void definition() {
        System.out.println("普通用户....");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告!!");
    }
}
