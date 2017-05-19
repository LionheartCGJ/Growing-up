package shiyanlou.blocking.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

      /**
       * service.execute() 方法执行完传入的线程后不会自动结束
       */
      /*ExecutorService service = Executors.newCachedThreadPool();
        service.execute(producer);
        service.execute(consumer);*/
        Thread produceThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        produceThread.start();
        consumerThread.start();
        
        
    }

}
