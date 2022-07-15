
class Display {
  public static synchronized void wish(String name) {
    for (int i = 0; i < 3; i++) {
      System.out.print("Good Morning: ");
      System.out.println(name);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
      }
    }
  }
}

class MyThreadNew extends Thread {
  Display d;
  String name;

  MyThreadNew(Display d, String name) {
    this.d = d;
    this.name = name;
  }

  public void run() {
    d.wish(name);
  }
}

public class StaticMethodSync {
  public static void main(String arg[]) {
    Display d1 = new Display();
    Display d2 = new Display();
    MyThreadNew t1 = new MyThreadNew(d1, "Dhoni");
    MyThreadNew t2 = new MyThreadNew(d2, "Yuvaraj");
    t1.start();
    t2.start();
  }
}
