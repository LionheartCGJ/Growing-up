package co.cgj.pattern.iterator;

/**
 * Iterator:迭代器抽象类
 */
public interface Iterator {

    // 迭代器的相关方法
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();

}
