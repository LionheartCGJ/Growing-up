package com.cgj.pattern.compisite;

/**
 * Leaf：在组合中表示叶节点对象，叶节点没有子节点
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        System.out.println("Cannot add to a leaf!");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove from a leaf!");

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
