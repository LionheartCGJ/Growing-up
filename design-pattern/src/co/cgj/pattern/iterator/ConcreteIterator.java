package co.cgj.pattern.iterator;

/**
 * ConcreteIterator:具体迭代器类,实现Iterator接口
 */
public class ConcreteIterator implements Iterator {

    // 定义了一个具体的聚集对象
    private ConcreteAggregate aggregate;
    // 当前索引
    private int nextIndex = 1;

    // 初始化时传入Aggregate
    public ConcreteIterator(ConcreteAggregate aggregate) {
        super();
        this.aggregate = aggregate;
    }

    // 获取头部元素
    @Override
    public Object first() {
        if (aggregate.count() > 0) {
            return aggregate.get(0);
        }
        return null;
    }

    // 获取下一个元素
    @Override
    public Object next() {

        if (nextIndex >= aggregate.count()) {
            return null;
        }
        return aggregate.get(nextIndex++);
    }

    // 遍历是否结束
    @Override
    public boolean isDone() {
        return nextIndex < aggregate.count();
    }

    // 获取当前元素
    @Override
    public Object currentItem() {
        if (aggregate.count() > 0) {
            return aggregate.get(nextIndex - 1);
        }
        return null;
    }

}
