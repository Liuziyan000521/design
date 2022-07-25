package com.rjxy.openandclose;

import com.rjxy.principle.openandclose.ICalculationArea;
import com.rjxy.principle.openandclose.impl.CalculationAreaExt;

/**
 * @Description Test
 * @Author 蜻蜓队长
 * @Date 2022/7/23 23:25
 * @Version 0.1
 */
public class Test {
    public static void main(String[] args) {
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }
}
