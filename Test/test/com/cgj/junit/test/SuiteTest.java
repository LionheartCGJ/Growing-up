package com.cgj.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CalculateTest.class })
public class SuiteTest {

    /**
     * 1.测试套件就是组织测试类一起运行的类
     * 如何创建一个测试套件
     *  a.创建一个测试类，该类不能包含其他方法
     *  b.使用@RunWith(Suite.class)注解，修改测试运行器为Suite.class
     *  c.使用@Suite.SuiteClasses({ xxx.class, xxx.class })注解把要运行的测试类添加进去  
     */
}
