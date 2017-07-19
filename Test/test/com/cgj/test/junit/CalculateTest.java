package com.cgj.test.junit;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgj.test.junit.Calculate;

/**
 * 1.Failure一般由单元测试的断言方法判断失败所引起，这表示测试点发现了问题，就是说程序输出结果和我们预期的不一样
 * 2.error是由代码异常引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中的一个隐藏的bug
 * 3.测试用例不是用来证明你是对的，而是用来证明你没有错。
 */
public class CalculateTest {

    /**
     * 1.beforeClass & afterClass是静态的只在类加载时执行一次，适合配置文件的加载和资源的关闭 
     * 2.before & after 方法在每个测试方法之前和之后执行
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class!");
    }

    @Before
    public void before() {
        System.out.println("Before!");
    }

    @After
    public void after() {
        System.out.println("After!");
    }

    /**
     * @Ignore 忽略执行该测试方法
     * @Test(expected=XX.class):预期抛出某异常，只有抛出该异常才认为测试通过
     * @Test(timeout=毫秒):超市时间，运行超过该时间认为测试不通过
     * @RunWith 可以更改测试运行器(继承org.junit.runner.Runner)
     */
    @Test
    public void testAdd() {
        assertEquals(6, new Calculate().add(3, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, new Calculate().subtract(3, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(9, new Calculate().multiply(3, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(1, new Calculate().divide(3, 3));
    }

}
