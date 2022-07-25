package com.rjxy.principle.inverted.fresh;

import com.rjxy.principle.inverted.old.BetUser;

import java.util.List;

/**
 * @Description DrawControl
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:19
 * @Version 0.1
 */
public class DrawControl {
    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> list, int count) {
        return draw.prize(list, count);
    }
}
