
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerNew {

  public static void main(String[] args) throws InterruptedException {

    BlockingQueue<Integer> bq = new LinkedBlockingDeque<Integer>(2);
    Thread t1 = new Thread(new Runnable() {

      @Override
      public void run() {
        int value = 0;
        try {
          while (true) {
            bq.put(value);
            System.out.println("produced " + value);
            value++;
            Thread.sleep(1000);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }

      }

    });
    Thread t2 = new Thread(new Runnable() {

      @Override
      public void run() {
        try {
          while (true) {
            int value = bq.take();
            System.out.println("Consumed " + value);
            Thread.sleep(1000);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }

      }

    });
    t1.start();
    t2.start();

    t1.join();
    t2.join();

  }

}
