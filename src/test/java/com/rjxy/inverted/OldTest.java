package com.rjxy.inverted;

import com.alibaba.fastjson2.JSON;
import com.rjxy.inverted.old.BetUser;
import com.rjxy.inverted.old.DrawControl;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description OldTest
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:15
 * @Version 0.1
 */
public class OldTest {
    public static void main(String[] args) {
        List<BetUser> list = new ArrayList<BetUser>() {{
            add(new BetUser("小花", 65));
            add(new BetUser("中花", 43));
            add(new BetUser("大花", 54));
            add(new BetUser("小牛", 145));
            add(new BetUser("大牛", 1));
        }};
        DrawControl drawControl = new DrawControl();
        System.out.println("随机抽奖，中将用户:" + JSON.toJSONString(drawControl.doDrawRandom(list, 3)));
        System.out.println("权重抽奖，中将用户:" + JSON.toJSONString(drawControl.doDrawWeight(list, 3)));
    }
}
