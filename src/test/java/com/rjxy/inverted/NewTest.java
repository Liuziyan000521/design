package com.rjxy.inverted;

import com.alibaba.fastjson2.JSON;
import com.rjxy.principle.inverted.fresh.DrawControl;
import com.rjxy.principle.inverted.fresh.DrawRandom;
import com.rjxy.principle.inverted.fresh.DrawWeight;
import com.rjxy.principle.inverted.old.BetUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description NewTest
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:21
 * @Version 0.1
 */
public class NewTest {
    public static void main(String[] args) {
        List<BetUser> list = new ArrayList<BetUser>() {{
            add(new BetUser("小花", 65));
            add(new BetUser("中花", 43));
            add(new BetUser("大花", 54));
            add(new BetUser("小牛", 145));
            add(new BetUser("大牛", 1));
        }};
        DrawControl drawControl = new DrawControl();
        List<BetUser> list1 = drawControl.doDraw(new DrawRandom(), list, 3);
        System.out.println("随机抽奖，中将用户:" + JSON.toJSONString(list1));
        List<BetUser> list2 = drawControl.doDraw(new DrawWeight(), list, 3);
        System.out.println("权重抽奖，中将用户:" + JSON.toJSONString(list2));

    }
}
