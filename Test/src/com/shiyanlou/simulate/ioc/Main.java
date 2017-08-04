package com.shiyanlou.simulate.ioc;

import java.lang.reflect.Field;

public class Main {
    public static void ioc(String className, Shiyanlou s, String methodName, String name) {
        try {
            Class<?> clazz = Class.forName(className);
            Object object = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if ("shiyanlou.simulate.ioc.Shiyanlou".equals((field.getType().getName()))) {
                    field.setAccessible(true);
                    field.set(object, s);
                    clazz.getMethod(methodName, String.class).invoke(object, name);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
