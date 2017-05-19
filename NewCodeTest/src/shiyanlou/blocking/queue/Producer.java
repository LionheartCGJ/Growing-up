package shiyanlou.blocking.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Producer implements Runnable {
    private final BlockingQueue<String> queue;
    private static AtomicInteger count = new AtomicInteger(0);

    public Producer(BlockingQueue<String> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (count.get() < 10) {
                String course = "Course" + count.incrementAndGet();
                System.out.println("Complete production:" + course);
                queue.put(course);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
