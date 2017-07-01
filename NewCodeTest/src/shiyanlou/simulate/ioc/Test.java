package shiyanlou.simulate.ioc;

public class Test {

    public static void main(String[] args) {
        Shiyanlou shiyanlou = new ShiyanlouImpl();
        System.out.println(shiyanlou.toUp(null));
        
        Main.ioc("shiyanlou.simulate.ioc.Temp", new ShiyanlouImpl(), "toUp", "aaaa");
    }

}
