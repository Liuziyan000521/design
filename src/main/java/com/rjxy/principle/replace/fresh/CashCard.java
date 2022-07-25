package com.rjxy.principle.replace.fresh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Description CashCard
 * @Author 蜻蜓队长
 * @Date 2022/7/24 19:52
 * @Version 0.1
 */
public class CashCard extends BankCard {
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public CashCard(String cardDate, String cardNo) {
        super(cardDate, cardNo);
    }

    boolean rule(BigDecimal amount) {
        return true;
    }


    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 0000 成功
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        logger.info("提现成功，单号:{} 金额:{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    public String recharge(String orderId, BigDecimal amount) {
        logger.info("储蓄成功 单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        logger.info("风险校验： 卡号：{} 单号：{} 金额：{}", cardNo, orderId, amount);
        return true;
    }
}
