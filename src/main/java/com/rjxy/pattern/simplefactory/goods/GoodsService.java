package com.rjxy.pattern.simplefactory.goods;

import com.alibaba.fastjson2.JSON;

/**
 * @Description GoodsService
 * @Author 蜻蜓队长
 * @Date 2022/7/25 20:57
 * @Version 0.1
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
