package com.cgj.pattern.builder;

/**
 * 具体的建造者类，实现Builder接口，构造和装配各个部件
 */
public class ConcreteBuilderB implements Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.AddPart("partX");
    }

    @Override
    public void builderPartB() {
        product.AddPart("partY");

    }

    @Override
    public Product GetResult() {
        return product;
    }

}
