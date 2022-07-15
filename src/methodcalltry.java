
public class methodcalltry {
  static int count = 0;

  /**
   * @param args
   */
  public static void main(String[] args) {

    try {
      // TODO Auto-generated method stub
      System.out.println("this is my start");
      methodcall();
    } finally {
      System.out.println("count valus is " + count);
    }
  }

  public static void methodcall() {
    count++;
    System.out.println("count is " + count);
    methodcall();
  }

}
