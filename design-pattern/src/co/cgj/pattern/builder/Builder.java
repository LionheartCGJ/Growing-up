package co.cgj.pattern.builder;

/**
 * 建造者的抽象类，为创建Product对象时指定各个部件
 */
public interface Builder {

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract Product GetResult();
}
