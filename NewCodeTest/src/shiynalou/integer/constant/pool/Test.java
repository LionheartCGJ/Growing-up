package shiynalou.integer.constant.pool;

public class Test {

    public static void main(String[] args) {
        IntegerExt ieA = IntegerExt.getInstance(3);
        IntegerExt ieB = IntegerExt.getInstance(3);
        IntegerExt ieC = IntegerExt.getInstance(133);
        IntegerExt ieD = IntegerExt.getInstance(133);

        System.out.println(ieA == ieB);
        System.out.println(ieC == ieD);
        System.out.println(ieA.equals(ieB));
        System.out.println(ieC.equals(ieD));
    }

}
