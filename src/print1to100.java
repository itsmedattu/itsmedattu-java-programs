
public class print1to100 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("hi");
    print100 p100 = new print100();
    p100.print100Function();
  }

}

class print100 {
  public int print100Function() {
    try {
      for (int i = 1; i < 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("AB");
          continue;
        } else if (i % 3 == 0) {
          System.out.print("A");
        } else if (i % 5 == 0) {
          System.out.print("B");
        } else {
          System.out.print(i);
        }
      }
      return 0;

    } catch (Exception e) {
      return -1;
    }
  }
}
