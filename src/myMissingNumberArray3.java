
import java.util.Scanner;

public class myMissingNumberArray3 {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int T = 0;
    int N = 0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      N = sc.nextInt();
      int[] myArray = new int[N + 1];
      for (int j = 0; j < N - 1; j++) {
        myArray[sc.nextInt() - 1] = 1;
      }
      System.out.println(findmissingNumberinArray(myArray, N));
      myArray = null;
      N = 0;
    }

    long endTime = System.nanoTime();
    System.out.println("Program execution time " + (endTime - startTime));
  }

  public static int findmissingNumberinArray(int[] myarray, int N) {
    for (int i = 0; i < N; i++) {
      if (myarray[i] != 1) {
        return i + 1;
      }
    }
    return 0;
  }

}
