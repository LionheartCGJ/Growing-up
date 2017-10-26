package com.cgj.test.clone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class cloneTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
      //浅拷贝与深拷贝  
        //浅拷贝:被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。  
        //换言之，浅复制仅仅复制所考虑的对象，而不复制它所引用的对象。  
        //深拷贝：被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。  
        //那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象。  
        //换言之，深复制把要复制的对象所引用的对象都复制了一遍。   

        //数组   
        AtomicInteger[] ss={new AtomicInteger(0),new AtomicInteger(0),new AtomicInteger(0)};  
        AtomicInteger[] tt=ss; //浅拷贝  
        AtomicInteger[] ww=(AtomicInteger[])ss.clone();//浅拷贝  
        System.out.println("ss:"+ss[1].get()+" tt:"+tt[1].get()+" ww:"+ww[1].get());  
        tt[1].incrementAndGet();  
        ww[1].incrementAndGet();  
        System.out.println("ss:"+ss[1].get()+" tt:"+tt[1].get()+" ww:"+ww[1].get());  
          
          
        //list列表          
        ArrayList<AtomicInteger> a=new ArrayList<AtomicInteger>();  
        for(int i=0;i<10;i++){  
            a.add(new AtomicInteger(i));  
        }  
        ArrayList<AtomicInteger> b=a;//浅拷贝  
        ArrayList<AtomicInteger> c=new ArrayList<AtomicInteger>(a);//深拷贝  
        ArrayList<AtomicInteger> d=(ArrayList<AtomicInteger>)a.clone();//深拷贝  
        System.out.println("a:"+a.get(1)+" b:"+b.get(1)+" c:"+c.get(1)+" d:"+d.get(1));  
        b.get(1).incrementAndGet(); 
        c.get(1).incrementAndGet();
        System.out.println("a:"+a.get(1).get()+" b:"+b.get(1).get()+" c:"+c.get(1).get()+" d:"+d.get(1).get());  
          
        //HashMap  
        HashMap<String, AtomicInteger> h=new HashMap<String, AtomicInteger>();  
        h.put("1", new AtomicInteger(1));  
        HashMap<String, AtomicInteger> m=h;//浅拷贝  
        HashMap<String, AtomicInteger> p=new HashMap<String, AtomicInteger>(h);//浅拷贝  
        HashMap<String, AtomicInteger> n=(HashMap<String, AtomicInteger>) h.clone();//浅拷贝  
        System.out.println("h:"+h.get("1").get()+" m:"+m.get("1").get()+" p:"+p.get("1").get()+ " n:"+n.get("1").get());  
        m.get("1").incrementAndGet();  
        p.get("1").incrementAndGet();  
        n.get("1").incrementAndGet();  
        System.out.println("h:"+h.get("1").get()+" m:"+m.get("1").get()+" p:"+p.get("1").get()+ " n:"+n.get("1").get());

        //ConcurrentHashMap
        Map<String, AtomicInteger> chm = new ConcurrentHashMap<String, AtomicInteger>();
        chm.put("1", new AtomicInteger(1));
        Map<String, AtomicInteger> chmq = chm;//浅拷贝
        Map<String, AtomicInteger> chms = new ConcurrentHashMap<String, AtomicInteger>(chm);//浅拷贝
        chm.get("1").incrementAndGet();
        System.out.println("chmq:" + chmq.get("1").get() + " chms:" + chms.get("1").get());

 
    }
}
