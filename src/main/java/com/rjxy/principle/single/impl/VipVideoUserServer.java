package com.rjxy.principle.single.impl;

import com.rjxy.principle.single.IVideoUserServer;

/**
 * @Description VipVideoUserServer vip用户
 * @Author 蜻蜓队长
 * @Date 2022/7/23 20:59
 * @Version 0.1
 */
public class VipVideoUserServer implements IVideoUserServer {
    @Override
    public void definition() {
        System.out.println("VIP用户 视频....");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP，无广告!!");
    }
}
