package com.rjxy.simpleFactory;

import com.rjxy.pattern.simplefactory.ICommodity;
import com.rjxy.pattern.simplefactory.StoreFactory;
import com.rjxy.pattern.simplefactory.impl.CouponCommodityService;

/**
 * @Description Demo
 * @Author 蜻蜓队长
 * @Date 2022/7/25 21:12
 * @Version 0.1
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        //1. 第一种
        ICommodity commodity = storeFactory.getCommodityService(1);
        commodity.sendCommodity("10001", "EMERGWERT12431451231", "1234512312", null);

        ICommodity commodityService = storeFactory.getCommodityService(CouponCommodityService.class);
        commodityService.sendCommodity("10001", "EMERGWERT12431451231", "1234512312", null);
    }
}
