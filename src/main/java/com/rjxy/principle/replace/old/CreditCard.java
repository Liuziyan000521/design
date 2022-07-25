package com.rjxy.principle.replace.old;

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


    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 0000 成功
     */
    @Override
    public String withdrawal(String orderId, BigDecimal amount) {

        // 校验
        if (amount.compareTo(new BigDecimal(1000)) >= 0) {
            logger.info("贷款金额校验(限额1000)，单号：{} 金额：{}", orderId, amount);
            return "0001";
        }

        //模拟生成贷款但
        logger.info("生成贷款单，单号：{} 金额：{}", orderId, amount);
        // 模拟支付成功
        logger.info("贷款成功，单号：{} 金额：{}", orderId, amount);
        return "0000";
    }

    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    @Override
    public String recharge(String orderId, BigDecimal amount) {
        // 模拟生成还款单
        logger.info("生成还款单，单号:{} 金额：{}",orderId,amount);

        // 模拟还款成功
        logger.info("还款成功，单号:{} 金额：{}",orderId,amount);
        return "0000";
    }

    @Override
    public List<String> tradeFlow() {
        return super.tradeFlow();
    }
}
