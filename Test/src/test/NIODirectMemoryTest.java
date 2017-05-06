package test;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicLong;

public class NIODirectMemoryTest {

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Class bitsClass = null;
        Field maxMemory = null;
        Field reservedMemory = null;
        try {
            // 通过类的全限定名，获取类的字节码文件
            bitsClass = Class.forName("java.nio.Bits");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();// debugger out info
        }
        if (bitsClass != null) {
            try {
                // 获取静态私有属性maxMemory及其值
                maxMemory = bitsClass.getDeclaredField("maxMemory");
                maxMemory.setAccessible(true);
                // 获取静态私有属性reservedMemory及其值
                reservedMemory = bitsClass.getDeclaredField("reservedMemory");
                reservedMemory.setAccessible(true);
            } catch (Exception e) {
                e.printStackTrace();// debugger out info
            }
        }
        for (int i = 0; i < 100; i++) {
            if (maxMemory != null && reservedMemory != null) {
                try {
                    Object maxValue = maxMemory.get(bitsClass);
                    long maxLong = 0L;
                    if (maxValue instanceof Long) {
                        maxLong = (Long) maxValue;
                    } else if (maxValue instanceof AtomicLong) {
                        maxLong = ((AtomicLong) maxValue).get();
                    }
                    System.out.println(maxLong);
                    Object reservedValue = reservedMemory.get(bitsClass);
                    long reservedLong = 0L;
                    if (reservedValue instanceof Long) {
                        reservedLong = (Long) reservedValue;
                    } else if (reservedValue instanceof AtomicLong) {
                        reservedLong = ((AtomicLong) reservedValue).get();
                    }
                    System.out.println(reservedLong);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
