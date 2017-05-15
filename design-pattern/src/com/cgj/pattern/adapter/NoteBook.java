package com.cgj.pattern.adapter;

/**
 * 笔记本
 */
public class NoteBook {

    // 需要三相插座供电
    private ThreePhaseSocket socket;

    public NoteBook(ThreePhaseSocket socket) {
        super();
        this.socket = socket;
        System.out.println("笔记本启动，需要三相电流供电...");
    }

    // 使用插座充电
    public void charge() {
        socket.powerWithThree();
    }

}
