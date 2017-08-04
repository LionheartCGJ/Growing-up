package com.shiyanlou.string.judge.empty;

public class Test {

    public static void main(String[] args) {
        if(StringUtils.allIsNotNull("aaa", "aaa", "aaa")) {
            System.out.println("pass!");
        }
        
        if(StringUtils.allIsNotNull("aaa", "", "aaa")){
            System.out.println("pass!");
        }
        
        if(StringUtils.allIsNotEmpty("aaa", "", null)){
            System.out.println("pass!");
        }
        
        if(StringUtils.allIsNotEmpty("aaa", "", "aaa")){
            System.out.println("pass!");
        }
    }

}
