package com.rjxy.principle.single;

/**
 * @Description OldWriting
 * @Author 蜻蜓队长
 * @Date 2022/7/23 20:53
 * @Version 0.1
 */
public class OldWriting {
    public static void main(String[] args) {
    }

    public void serveGrade(String userType) {
        if ("VIP用户".equals(userType)) {
            System.out.println("VIP用户 视频....");
        } else if ("普通用户".equals(userType)) {
            System.out.println("普通用户....");
        } else if ("访客用户".equals(userType)) {
            System.out.println("访客用户...");
        }
    }
}
