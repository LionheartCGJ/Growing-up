package com.shiyanlou.blocking.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Producer implements Runnable {
    private final BlockingQueue<String> queue;
    private static AtomicInteger count = new AtomicInteger(0);
    private String context = "Complete production:Course";

    public Producer(BlockingQueue<String> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (count.get() < 10) {
                String number = String.valueOf(count.incrementAndGet());
                System.out.println(context + number);
                queue.put(number);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
