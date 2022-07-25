package com.rjxy.signle;

import com.rjxy.principle.single.IVideoUserServer;
import com.rjxy.principle.single.impl.GuestVideoUserServer;
import com.rjxy.principle.single.impl.VipVideoUserServer;

/**
 * @Description NewTest
 * @Author 蜻蜓队长
 * @Date 2022/7/23 21:01
 * @Version 0.1
 */
public class NewTest {
    public static void main(String[] args) {
        IVideoUserServer guest = new GuestVideoUserServer();
        guest.advertisement();
        guest.definition();

        IVideoUserServer vip = new VipVideoUserServer();
        vip.advertisement();
        vip.definition();
    }
}
