package temp.com.cgj.test;

public class IntegerTest {

    public static void main(String[] args) {
        int min = Integer.MIN_VALUE - 1;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(min);
        
        int max= Integer.MAX_VALUE + 1;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(max);
        
        Object o = 8;
        Long l = Long.valueOf((Integer)o);
        System.out.println(l);
        Double d = l.doubleValue();
        System.out.println(d);
        Integer i = l.intValue();
        System.out.println(i);
    }

}
