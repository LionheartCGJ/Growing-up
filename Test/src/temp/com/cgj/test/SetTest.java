package temp.com.cgj.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Node> set = new HashSet<>();
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        set.add(new Node(2));
        for (Node node : set) {
            System.out.println(node.getNum());
        }
    }
}
