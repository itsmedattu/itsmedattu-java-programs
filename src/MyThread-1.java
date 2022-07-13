/*
 * public class MyThread-1 {
 * 
 *//**
	 * @param args
	 * @throws InterruptedException
	 *//*
		 * @SuppressWarnings("deprecation") public static void main(String[] args)
		 * throws InterruptedException { // TODO Auto-generated method stub
		 * 
		 * Thread t1=new Thread(new Threadclass()); t1.start(); Thread t2=new Thread(new
		 * Threadclass()); t2.start(); t1.setName("T1"); t2.setName("T2");
		 * 
		 * 
		 * 
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * // Threadnew tnew=new Threadnew(); //Threadnew tnew1=new Threadnew();
		 * //tnew.start(); //tnew1.start(); final PC pc=new PC(); Thread tt1=new
		 * Thread(new Runnable() {
		 * 
		 * @Override
		 * 
		 * public void run() {
		 * 
		 * System.out.println("thread state is "+Thread.currentThread().getState()); //
		 * TODO Auto-generated method stub try { pc.produce(); } catch (Exception e) {
		 * // TODO: handle exception } } });
		 * 
		 * Thread tt2=new Thread(new Runnable() { public void run() { try {
		 * pc.consume(); } catch (Exception e) { // TODO: handle exception } } });
		 * 
		 * tt1.start(); tt2.start();
		 * 
		 * System.out.println("thread state is . "+tt1.getState()); // tt1.interrupt();
		 * tt1.join(); tt2.join();
		 * System.out.println("thread state is .."+tt1.getState());
		 * 
		 * } } class Threadclass implements Runnable { public void run(){ for(int
		 * i=0;i<20;i++){ String name=Thread.currentThread().getName();
		 * System.out.println(name+" "+i); } }
		 * 
		 * }
		 */