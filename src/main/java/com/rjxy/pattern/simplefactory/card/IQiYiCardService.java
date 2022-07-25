package com.rjxy.pattern.simplefactory.card;

/**
 * @Description IQiYiCardService
 * @Author 蜻蜓队长
 * @Date 2022/7/25 20:54
 * @Version 0.1
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员一张：" + bindMobileNumber + "," + cardId);
    }
}
