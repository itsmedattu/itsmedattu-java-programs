/*
 * class MyThread1 extends Thread{ public void run(){
 * System.out.println("shut down hook task completed.. name is "+Thread.
 * currentThread().getName()); } }
 * 
 * public class MyThread{ public static void main(String[] args)throws Exception
 * {
 * 
 * Runtime r=Runtime.getRuntime(); r.addShutdownHook(new MyThread1());
 * Thread.currentThread().setName("dattu");
 * 
 * System.out.println("Now main sleeping... press ctrl+c to exit");
 * try{Thread.sleep(3000);}catch (Exception e) {} } }
 */