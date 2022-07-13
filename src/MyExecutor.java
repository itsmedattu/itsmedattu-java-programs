

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		MyThread t=new  MyThread();
		for(int i=0;i<3;i++) {
			es.execute(t);
		}
		es.shutdown();
		
		while(es.isTerminated()) {
			
		}
		System.out.println("threads completed their task");

	}

}

class MyThread implements Runnable{
	public void run() {
		System.out.println("Thread name is "+Thread.currentThread().getName());
	}
}
