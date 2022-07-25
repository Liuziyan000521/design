package com.rjxy.principle.inverted.fresh;

import com.rjxy.principle.inverted.old.BetUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description DrawWeight
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:19
 * @Version 0.1
 */
public class DrawWeight implements IDraw {
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        list.sort((o1, o2) -> o2.getUserWeight() - o1.getUserWeight());
        // 取出指定数量的中将用户
        List<BetUser> prizeList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
