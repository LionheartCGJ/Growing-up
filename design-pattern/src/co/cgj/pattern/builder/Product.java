package co.cgj.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体产品类
 */
public class Product {

    List<String> parts = new ArrayList<String>();

    public void AddPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Creat product!");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
