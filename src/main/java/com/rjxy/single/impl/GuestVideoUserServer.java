package com.rjxy.single.impl;

import com.rjxy.single.IVideoUserServer;

/**
 * @Description GuestVideoUserServer 访客用户
 * @Author 蜻蜓队长
 * @Date 2022/7/23 20:58
 * @Version 0.1
 */
public class GuestVideoUserServer implements IVideoUserServer {
    @Override
    public void definition() {
        System.out.println("访客用户...");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告...");
    }
}
