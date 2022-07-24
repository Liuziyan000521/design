package com.rjxy.openandclose.impl;

/**
 * @Description CalculationAreaExt
 * @Author 蜻蜓队长
 * @Date 2022/7/23 23:23
 * @Version 0.1
 */
public class CalculationAreaExt extends CalculationArea {

    @Override
    public double circular(double r) {
        return Math.PI * r * r;
    }
}
