package shiyanlou.blocking.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Consumer implements Runnable {
    private final BlockingQueue<String> queue;
    private static AtomicInteger count = new AtomicInteger(0);

    public Consumer(BlockingQueue<String> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (count.getAndIncrement() < 10) {
                String course = queue.take();
                System.out.println("Complete consumption:" + course);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
