package com.cgj.pattern.compisite;

/**
 * 何时使用组合模式：需求中是体现部分与整体层次的结构时，
 *          以及你希望用户可以忽略组合对象与单个对象的不同时，
 *          统一使用组合结构中的所有对象时，
 *          就因该考虑用组合模式了。
 * 透明方式：在Component中声明所有用来管理子对象的方法，例如addremove的等。
 *          这样继承Component的所有子对象都具备了add和remove方法。
 *          这样做的好处是叶节点和树枝节点对于外界没有区别，
 *          他们具有完全一致的行为接口。
 *          但是问题也很明显，因为Leaf类本身不具备add和remove方法的功能，
 *          所以实现它是完全没有意义的。
 * 安全方式：在Component中不去声明add和remove方法，
 *          那么子类Leaf也就不需要去实现它，
 *          而是在Component声明所有用来管理子类对象的方法，
 *          不过由于不够透明，所以树叶和树枝类将具有不同的方法，
 *          客户端在调用的时候需要做相应的判断，带来了不便。
 */
public class Test {

    public static void main(String[] args) {
        Component root = new Composite("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        Component componentX = new Composite("Composite X");
        componentX.Add(new Leaf("Leaf XA"));
        componentX.Add(new Leaf("Leaf XB"));
        root.Add(componentX);

        Component componentXY = new Composite("Composite XY");
        componentXY.Add(new Leaf("Leaf XYA"));
        componentXY.Add(new Leaf("Leaf XYB"));
        componentX.Add(componentXY);

        root.Add(new Leaf("Leaf C"));

        Leaf leafD = new Leaf("Leaf D");
        root.Add(leafD);
        root.remove(leafD);
        
        root.display(1);

    }

}
