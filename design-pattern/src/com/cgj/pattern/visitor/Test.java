package com.cgj.pattern.visitor;

/**
 * 首先在display函数中将具体的状态传递给Man类完成第一次分派,
 * 然后Man调用作为参数的状态类中的getManConslusion函数同时将自身
 * 作为参数传递进去,这便完成了第二次分派.
 * 
 * Blog:https://i.cnblogs.com/EditPosts.aspx?opt=1
 */
public class Test {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();

        structure.add(new Man());
        structure.add(new Woman());

        System.out.println("成功时的反应");
        structure.display(new Success());

        System.out.println("失败时的反应");
        structure.display(new Failing());

        System.out.println("恋爱时的反应");
        structure.display(new Amativeness());
    }

}
