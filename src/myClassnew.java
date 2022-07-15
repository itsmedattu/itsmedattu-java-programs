
public class myClassnew {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    myCC o = new myCC();
    o.hello();
    o.hi();
    o.hey();
  }

}

interface myI {
  void hello();

  void hi();
}

abstract class myC implements myI {
  public abstract void hello();

  public abstract void hi();

  void hey() {
    System.out.println("Hey");
  }
}

class myCC extends myC {
  public void hello() {
    System.out.println("Hello");

  }

  public void hi() {
    System.out.println("Hi");

  }

}