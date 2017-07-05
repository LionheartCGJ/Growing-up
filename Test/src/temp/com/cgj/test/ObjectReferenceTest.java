package temp.com.cgj.test;

import java.util.ArrayList;
import java.util.List;

public class ObjectReferenceTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String>  list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        
        List<String> list2 = list;
        
        System.out.println("list == list2:" + (list == list2));
        
        list2.remove(2);
        for (String string : list) {
            System.out.println(string);
        }
    }

}
