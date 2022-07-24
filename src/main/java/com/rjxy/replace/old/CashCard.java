package com.rjxy.replace.old;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description CashCard
 * @Author 蜻蜓队长
 * @Date 2022/7/24 19:52
 * @Version 0.1
 */
public class CashCard {
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);


    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 0000 成功
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        logger.info("提现成功，单号:{} 金额:{}", orderId, amount);
        return "0000";
    }

    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    public String recharge(String orderId, BigDecimal amount) {
        logger.info("储蓄成功 单号：{} 金额：{}", orderId, amount);
        return "0000";
    }

    /**
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        logger.info("交易流水查询成功");
        List<String> list = new ArrayList<>();
        list.add("100001, 100.00");
        list.add("100002, 80.00");
        list.add("100003, 70.00");
        list.add("100004, 125.00");
        return list;
    }
}
