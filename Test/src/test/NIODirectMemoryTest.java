package test;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicLong;

public class NIODirectMemoryTest {

    public static void main(String[] args) {
        Class bitsClass = null;
        try {
            // 通过类的全限定名，获取类的字节码文件
            bitsClass = Class.forName("java.nio.Bits");
            try {
                // 获取静态私有属性maxMemory及其值
                Field maxMemory = bitsClass.getDeclaredField("maxMemory");
                maxMemory.setAccessible(true);
                Object maxValue = maxMemory.get(bitsClass);
                long value = 0L;
                if (maxValue instanceof Long) {
                    value = (Long) maxValue;
                } else if (maxValue instanceof AtomicLong) {
                    value = ((AtomicLong) maxValue).get();
                }
                System.out.println(value);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            try {
                // 获取静态私有属性reservedMemory及其值
                Field reservedMemory = bitsClass.getDeclaredField("reservedMemory");
                reservedMemory.setAccessible(true);
                Object reservedValue = reservedMemory.get(bitsClass);
                long value = 0L;
                if (reservedValue instanceof Long) {
                    value = (Long) reservedValue;
                } else if (reservedValue instanceof AtomicLong) {
                    value = ((AtomicLong) reservedValue).get();
                }
                System.out.println(value);
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
