package com.cgj.junit.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 对一个方法进行多组数据的测试
 */
@RunWith(Parameterized.class)
public class ParameterTest {

    /**
     * 1.使用@RunWith(Parameterized.class)注解更改测试运行器
     * 2.声明变量来存放预期值和参数
     * 3.为测试类声明一个带有参数的公共构造函数，并在其中为声明的变量赋值
     * 4.声明一个返回值为Collection的公共静态方法，并使用@Parameters进行修饰
     * 5.声明测试方法，预期值和参数使用声明的变量
     */

    int expected;
    int param1;
    int param2;

    public ParameterTest(int expected, int param1, int param2) {
        this.expected = expected;
        this.param1 = param1;
        this.param2 = param2;
    }

    @Parameters
    public static Collection<Object[]> paramConfig(){
        return Arrays.asList(new Object[][]{
            {3,1,2},
            {4,1,3}
        });
    }

    @Test
    public void testAdd() {
        assertEquals(expected, new Calculate().add(param1, param2));
    }
}
