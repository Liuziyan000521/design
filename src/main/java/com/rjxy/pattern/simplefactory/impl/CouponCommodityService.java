package com.rjxy.pattern.simplefactory.impl;

import com.alibaba.fastjson2.JSON;
import com.rjxy.pattern.simplefactory.ICommodity;
import com.rjxy.pattern.simplefactory.coupon.CouponResult;
import com.rjxy.pattern.simplefactory.coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Description CouponCommodityService
 * @Author 蜻蜓队长
 * @Date 2022/7/25 21:03
 * @Version 0.1
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }

}
