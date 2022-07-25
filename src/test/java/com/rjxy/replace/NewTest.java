package com.rjxy.replace;

import com.rjxy.principle.replace.fresh.CashCard;
import com.rjxy.principle.replace.fresh.CreditCard;

import java.math.BigDecimal;

/**
 * @Description NewTest
 * @Author 蜻蜓队长
 * @Date 2022/7/24 20:36
 * @Version 0.1
 */
public class NewTest {
    public static void main(String[] args) {
        CashCard creditCard = new CreditCard("12314125134", "2022-03-05");
        // 提现，贷款
        creditCard.withdrawal("10001", new BigDecimal(10000));
        // 储蓄
        creditCard.recharge("10001", new BigDecimal(100));
    }
}
