package co.cgj.pattern.iterator;

public class Test {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.put("aaaa");
        aggregate.put("bbbb");
        aggregate.put("cccc");
        aggregate.put("dddd");
        aggregate.put("eeee");
        
        Iterator iterator = aggregate.CreateIterator();
        System.out.println(iterator.currentItem());
        while (iterator.isDone()) {
            System.out.println(iterator.next());
        }

    }

}
