package com.rjxy.inverted.fresh;

import com.rjxy.inverted.old.BetUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description DrawRandom
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:18
 * @Version 0.1
 */
public class DrawRandom implements IDraw {
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
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
}
