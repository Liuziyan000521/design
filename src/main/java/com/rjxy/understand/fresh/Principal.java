package com.rjxy.understand.fresh;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description Principal
 * @Author 蜻蜓队长
 * @Date 2022/7/24 21:54
 * @Version 0.1
 */
public class Principal {
    private Teacher teacher = new Teacher("梨花", "3年1班");

    public Map<String, Object> queryClazzInfo(String clazzId) {
        // 班级总人数
        int stuCount = teacher.clazzStudentCount();
        // 总分
        double totalScore = teacher.clazzTotalScore();

        // 平均分
        double averageScore = teacher.clazzAverageScore();
        Map<String, Object> map = new HashMap<>(16);
        map.put("班级", teacher.getClazz());
        map.put("老师", teacher.getName());
        map.put("学生人数", stuCount);
        map.put("总分", totalScore);
        map.put("平均分", averageScore);
        return map;
    }

}
