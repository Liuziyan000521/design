package com.rjxy.replace;

import com.alibaba.fastjson2.JSON;
import com.rjxy.principle.replace.old.CashCard;
import com.rjxy.principle.replace.old.CreditCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Description OldTest
 * @Author 蜻蜓队长
 * @Date 2022/7/24 20:19
 * @Version 0.1
 */
public class OldTest {
    private static final Logger log = LoggerFactory.getLogger(OldTest.class);

    public static void main(String[] args) {
        CashCard cashCard = new CashCard();
        cashCard.recharge("10001", BigDecimal.valueOf(100L));
        cashCard.withdrawal("10002", BigDecimal.valueOf(200L));
        log.info("查询交易流水:{}", JSON.toJSONString(cashCard.tradeFlow()));

        CreditCard creditCard = new CreditCard();
        creditCard.recharge("10001", BigDecimal.valueOf(100L));
        creditCard.withdrawal("10002", BigDecimal.valueOf(200L));
        creditCard.tradeFlow();
        log.info("查询交易流水:{}", JSON.toJSONString(creditCard.tradeFlow()));

    }
}
