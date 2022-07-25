package com.rjxy.pattern.simplefactory.impl;

import com.rjxy.pattern.simplefactory.ICommodity;
import com.rjxy.pattern.simplefactory.card.IQiYiCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Description CardCommodityService
 * @Author 蜻蜓队长
 * @Date 2022/7/25 20:59
 * @Version 0.1
 */
public class CardCommodityService implements ICommodity {
    private static final Logger log = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uid);
        iQiYiCardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uid:{} commodityId:{} bizId:{} extMap:{}", uid, commodityId, bizId, extMap);
        log.info("测试结果[爱奇艺兑换卡]:success");
    }

    private String queryUserMobile(String uid) {
        return "124r23413451";
    }
}
