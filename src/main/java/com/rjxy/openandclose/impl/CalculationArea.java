package com.rjxy.openandclose.impl;

import com.rjxy.openandclose.ICalculationArea;

/**
 * @Description CalculationArea
 * @Author 蜻蜓队长
 * @Date 2022/7/23 23:21
 * @Version 0.1
 */
public class CalculationArea implements ICalculationArea {
    private static final double PI = 3.140;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return Math.pow(r, 2) * PI;
    }
}
