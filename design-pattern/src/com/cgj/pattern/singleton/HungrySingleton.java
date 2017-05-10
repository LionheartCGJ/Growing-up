package com.cgj.pattern.singleton;

/**
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝、老婆
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：
 *      懒汉式：加载类事较慢，但运行时获取对象速度较快，线程安全
 *      恶汉式：加载类时较快，但运行时第一次获取对象是较慢，线程不安全
 */

/**
 * 饿汉式（在第一次获取实例的时候，初始化实例）
 */
public class HungrySingleton {
    // 1.私有化默认构造函数
    private HungrySingleton() {
    }

    // 2.声明类的唯一实例，用private static修饰符修饰
    private static HungrySingleton instance;

    // 3.创建一个全局的获取对象的方法，使用private static修饰符修饰
    public static HungrySingleton getInstance() {
        if (instance == null) {
            instance = new HungrySingleton();
        }
        return instance;
    }
}
