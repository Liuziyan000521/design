package com.rjxy.principle.isolation.fresh.impl;

import com.rjxy.principle.isolation.fresh.ISkillInvisible;
import com.rjxy.principle.isolation.fresh.ISkillSilent;
import com.rjxy.principle.isolation.fresh.ISkillVertigo;

/**
 * @Description HeroLianPo
 * @Author 蜻蜓队长
 * @Date 2022/7/24 22:52
 * @Version 0.1
 */
public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {
    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }
}
