package com.cgj.pattern.adapter;
/**
 * 适配器的作用：
 *    透明：通过适配器，客户端可以调用同一接口，因而对客户来说是透明的。
 *    重用：复用了现有的类，解决了现存类和复用环境要求不一致的问题。
 *    低耦合：将目标类和需要适配的类解耦，通过引入一个适配器重用现有的类，而无须修改原有代码（遵循开闭原则）
 */
public class Test {

    public static void main(String[] args) {
        //GBTwoPhaseSocket twoPhaseSocket = new GBTwoPhaseSocket();
        //ThreePhaseSocket threePhaseSocket = new TwoPhaseToThreePhaseAdapterByPolymerization(twoPhaseSocket);
        ThreePhaseSocket threePhaseSocket = new TwoPhaseToThreePhaseAdapterByExtends();
        NoteBook myNoteBook = new NoteBook(threePhaseSocket);
        myNoteBook.charge();
    }

}
