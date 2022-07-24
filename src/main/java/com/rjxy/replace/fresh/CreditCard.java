package com.rjxy.replace.fresh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description CreditCard
 * @Author 蜻蜓队长
 * @Date 2022/7/24 19:52
 * @Version 0.1
 */
public class CreditCard extends CashCard {
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public CreditCard(String cardDate, String cardNo) {
        super(cardDate, cardNo);
    }

    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }


    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 0000 成功
     */
    public String repayment(String orderId, BigDecimal amount) {

        //模拟生成贷款但
        logger.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        // 模拟支付成功
        logger.info("还款成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    public String loan(String orderId, BigDecimal amount) {
        boolean rule = rule2(amount);
        if (!rule) {
            logger.info("生成贷款单失效 单号：{} 金额：{}", orderId, amount);
            return "0001";
        }
        // 模拟生成还款单
        logger.info("生成还款单，单号:{} 金额：{}", orderId, amount);

        // 模拟还款成功
        logger.info("还款成功，单号:{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    @Override
    public List<String> tradeFlow() {
        return super.tradeFlow();
    }
}
