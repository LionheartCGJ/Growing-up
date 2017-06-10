package co.cgj.pattern.builder;

/**
 * 建造者模式：
 *      将一个复杂的对象的构建过程与他的表示分离，
 *      使得同样的创建过程可以创建不同的表示
 * 好处：
 *      建造者模式的好处就是使得建造代码与表示代码分离，
 *      由于建造者隐藏了该产品是如何创建的，
 *      所以如需要改变一个产品的内部表示，
 *      只需要再定义一个具体的建造者就可以了
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.construct(builderA);
        Product productA = builderA.GetResult();
        productA.show();

        director.construct(builderB);
        Product productB = builderB.GetResult();
        productB.show();

    }

}
