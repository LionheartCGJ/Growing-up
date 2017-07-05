package com.cgj.pattern.compisite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite:定义有枝节点行为，用来存储子部件，
 *           在Component接口中实现与子部件有关的操作，
 *           比如Add和Remove。
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();
    public Composite(String name) {
        super(name);
    }
    
    @Override
    public void Add(Component component) {
        children.add(component);
    }
    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    // 显示其枝节点名称，并对其下级进行遍历
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
