package com.rjxy.replace.fresh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description BankCard
 * @Author 蜻蜓队长
 * @Date 2022/7/24 19:52
 * @Version 0.1
 */
public abstract class BankCard {
    private static final Logger log = LoggerFactory.getLogger(BankCard.class);
    private String cardNo;
    private String cardDate;

    public BankCard(String cardDate, String cardNo) {
        this.cardDate = cardDate;
        this.cardNo = cardNo;
    }

    // 正向转账
    public String positive(String orderId, BigDecimal amount) {
        log.info("卡号：{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    // 逆向转账
    public String negative(String orderId, BigDecimal amount) {
        log.info("卡号：{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        log.info("交易流水查询成功");
        List<String> list = new ArrayList<>();
        list.add("100001, 100.00");
        list.add("100002, 80.00");
        list.add("100003, 70.00");
        list.add("100004, 125.00");
        return list;
    }
}
