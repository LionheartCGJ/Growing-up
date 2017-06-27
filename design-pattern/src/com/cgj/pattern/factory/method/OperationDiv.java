package com.cgj.pattern.factory.method;

/**
 * 除法运算类
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if(numberB == 0){
            System.out.println("Sorry,除数不能为: 0");
            return 0D;
        }
        return numberA / numberB;
    }
}
