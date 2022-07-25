package com.rjxy.pattern.simplefactory.coupon;

/**
 * @Description CouponResult
 * @Author 蜻蜓队长
 * @Date 2022/7/25 20:56
 * @Version 0.1
 */
public class CouponResult {

    private String code; // 编码
    private String info; // 描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}