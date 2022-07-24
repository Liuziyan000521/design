package com.rjxy.inverted.old;

/**
 * @Description BetUser
 * @Author 蜻蜓队长
 * @Date 2022/7/24 23:10
 * @Version 0.1
 */
public class BetUser {
    private String userName;
    /**
     * 用户权重
     */
    private int userWeight;

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserWeight() {
        return userWeight;
    }
}
