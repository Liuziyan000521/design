package com.rjxy.openandclose;

/**
 * @Description ICalculationArea 面积计算接口
 * @Author 蜻蜓队长
 * @Date 2022/7/23 23:19
 * @Version 0.1
 */
public interface ICalculationArea {

    /**
     * 计算长方形面积
     *
     * @param x 长
     * @param y 宽
     * @return 面积
     */
    double rectangle(double x, double y);

    /**
     * 计算三角形面积
     *
     * @param x 边长x
     * @param y 边长y
     * @param z 边长z
     * @return 面积
     */
    double triangle(double x, double y, double z);

    /**
     * 计算圆形面积
     *
     * @param r 半径
     * @return 面积
     */
    double circular(double r);
}
