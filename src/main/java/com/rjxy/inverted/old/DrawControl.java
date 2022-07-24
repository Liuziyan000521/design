package com.rjxy.inverted.old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description DrawControl
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:11
 * @Version 0.1
 */
public class DrawControl {
    // 随机抽奖
    public List<BetUser> doDrawRandom(List<BetUser> list, int count) {
        // 集合数量很小直接返回
        if (list.size() <= count) return list;

        // 乱序集合
        Collections.shuffle(list);

        // 取出指定数量的中将用户
        List<BetUser> prizeList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }

    // 权重抽奖
    public List<BetUser> doDrawWeight(List<BetUser> list, int count) {
        list.sort((o1, o2) -> o2.getUserWeight() - o1.getUserWeight());
        // 取出指定数量的中将用户
        List<BetUser> prizeList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
