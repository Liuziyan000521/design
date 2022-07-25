package com.rjxy.principle.inverted.fresh;

import com.rjxy.principle.inverted.old.BetUser;

import java.util.List;

/**
 * @Description IDraw
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:18
 * @Version 0.1
 */
public interface IDraw {
    List<BetUser> prize(List<BetUser> list, int count);
}
