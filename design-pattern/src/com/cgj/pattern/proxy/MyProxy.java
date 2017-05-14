package com.cgj.pattern.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 动态代理实现思路
 * 实现功能：通过MyProxy的newProxyInstance返回代理对象
 * 1.声明一段源码（动态产生代理）
 * 2.编译源码（JDK Compiler API），产生新的类（代理类）
 * 3.将这个类load到内存中，长生一个新的对象（代理对象）
 * 4.return 代理对象
 * 
 */
public class MyProxy {

    public static Object newProxyInstance(Class<?> interfaceClass, MyInvocationHandler h){
        String rt = System.getProperty("line.separator", "\r\n"); 
        String ft = File.separator;
        String interfaceName = interfaceClass.getName();
        String javaName = System.getProperty("user.dir") + ft +"bin" + ft +"com" + ft +"cgj" + ft +"pattern" + ft +"proxy" + ft + "$Proxy0.java";
        String className = "com.cgj.pattern.proxy.$Proxy0";
        String methodStr = "";
        for(Method m : interfaceClass.getMethods()){
            methodStr += "    @Override" + rt +
                         "    public void " + m.getName() + "(){" + rt +
                         "        try {" + rt +
                         "            Method md = " + interfaceClass.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
                         "            h.invoke(this, md);" + rt +
                         "        } catch (Throwable e) {e.printStackTrace();}" + rt +
                         "    }";
        }
        String source = 
                "package com.cgj.pattern.proxy;" + rt +
                "import java.lang.reflect.Method;" + rt +
                "import com.cgj.pattern.proxy.MyInvocationHandler;" + rt +
                "public class $Proxy0 implements " + interfaceName + " {" + rt +
                "    private MyInvocationHandler h;" + rt +
                "    public $Proxy0(MyInvocationHandler h) {" + rt +
                "       super();" + rt +
                "        this.h = h;" + rt +
                "     }" + rt + methodStr +
                "}";
        File file = new File(javaName);
        //将代码写入文件
        writeStrToFile(source, file);
        //编译生成的文件
        copiler(javaName);
        //load到内存
        Class<?> clazz = load(className);
        try {
            Constructor<?> constructor = clazz.getConstructor(MyInvocationHandler.class);
            return constructor.newInstance(h);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将String写入文件
     */
    private static void writeStrToFile(String source, File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            Writer os = new OutputStreamWriter(fos);
            os.write(source);
            os.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 编译java文件
     */
    private static void copiler(String fileName) {
        // 编译
        // 拿到编译器
        JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
        // 文件管理者
        StandardJavaFileManager fileMgr = complier.getStandardFileManager(null, null, null);
        // 获取文件
        Iterable<? extends JavaFileObject> units = fileMgr.getJavaFileObjects(fileName);
        // 编译任务
        CompilationTask task = complier.getTask(null, fileMgr, null, null, null, units);
        // 进行编译
        task.call();
        try {
            fileMgr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Class<?> load(String className) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = null;
        try {
            clazz = classLoader.loadClass(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clazz;
    }

}
