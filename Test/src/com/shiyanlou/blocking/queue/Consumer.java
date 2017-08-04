package com.shiyanlou.blocking.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Consumer implements Runnable {
    private final BlockingQueue<String> queue;
    private static AtomicInteger count = new AtomicInteger(0);
    private String context = "Complete consumption:Course";

    public Consumer(BlockingQueue<String> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (count.getAndIncrement() < 10) {
                System.out.println(context + queue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
