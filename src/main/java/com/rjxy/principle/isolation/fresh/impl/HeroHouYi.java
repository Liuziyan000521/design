package com.rjxy.principle.isolation.fresh.impl;

import com.rjxy.principle.isolation.fresh.ISkillArchery;
import com.rjxy.principle.isolation.fresh.ISkillInvisible;
import com.rjxy.principle.isolation.fresh.ISkillSilent;

/**
 * @Description HeroHouYi
 * @Author 蜻蜓队长
 * @Date 2022/7/24 22:51
 * @Version 0.1
 */
public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {
    @Override
    public void doArchery() {
        System.out.println("后裔的射箭");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默");
    }
}
