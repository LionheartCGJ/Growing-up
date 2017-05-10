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
 * 懒汉模式(在类加载时初始化实例)
 */
public class LazySingleton {
    // 1.将构造方法私有化，不允许外部直接创建对象
    private LazySingleton() {
    }

    // 2.创建类的唯一实例
    private static LazySingleton instance = new LazySingleton();

    // 3.提供一个用于获取实例的方法
    public static LazySingleton getInstance() {
        return instance;
    }
}
