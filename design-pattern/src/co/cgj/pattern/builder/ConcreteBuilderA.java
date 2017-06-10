package co.cgj.pattern.builder;

/**
 * 具体的建造者类，实现Builder接口，构造和装配各个部件
 */
public class ConcreteBuilderA implements Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.AddPart("partM");
    }

    @Override
    public void builderPartB() {
        product.AddPart("partN");

    }

    @Override
    public Product GetResult() {
        return product;
    }

}
