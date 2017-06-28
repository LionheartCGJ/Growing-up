package com.cgj.pattern.mediator;

/**
 * Blogs: http://www.cnblogs.com/LionheartCGJ/p/7067572.html
 */
public class Test {

    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
        USA usa =  new USA(unsc);
        Iraq iraq = new Iraq(unsc);
        
        unsc.setUsa(usa);
        unsc.setIraq(iraq);
        
        usa.declare("不准研制核武器,否则发动战争!!!");
        iraq.declare("我们没有核武器,也不怕侵略!!!");
    }

}
