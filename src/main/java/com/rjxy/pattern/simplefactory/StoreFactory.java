package com.rjxy.pattern.simplefactory;

import com.rjxy.pattern.simplefactory.impl.CardCommodityService;
import com.rjxy.pattern.simplefactory.impl.CouponCommodityService;
import com.rjxy.pattern.simplefactory.impl.GoodsCommodityService;

/**
 * @Description StoreFactory
 * @Author 蜻蜓队长
 * @Date 2022/7/25 21:04
 * @Version 0.1
 */
public class StoreFactory {
    /**
     * 奖品类型方式实例化
     *
     * @param commodityType 奖品类型
     * @return 实例化对象
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();

        throw new RuntimeException("不存在的奖品服务类");
    }

    /**
     * 奖品类型方式实例化
     *
     * @param clazz 将品类
     * @return 实例化对象
     */
    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws InstantiationException, IllegalAccessException {
        if (null == clazz) return null;
        return clazz.newInstance();
    }
}
