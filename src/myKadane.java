
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myKadane {

  public static void main(String[] args) throws Exception {
    int T = 0;
    int N = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      T = Integer.parseInt(br.readLine());
    } catch (NumberFormatException ex) {
      System.out.println("wrong input");
      System.exit(0);
    }
    if (T <= 0) {
      System.out.println("wrong input");
      System.exit(0);
    }

    for (int i = 0; i < T; i++) {
      try {
        N = Integer.parseInt(br.readLine());
      } catch (NumberFormatException ex) {
        System.out.println("wrong input ");
        System.exit(0);
      }
      if (N <= 0) {
        System.out.println("wrong input");
        System.exit(0);
      }
      int[] myArray = new int[N];
      for (int j = 0; j < N; j++) {
        String[] temp = br.readLine().split("\\s+");

        for (int k = 0; k < temp.length; k++) {
          try {
            myArray[k] = Integer.parseInt(temp[k]);
          } catch (NumberFormatException ex) {
            break;
          }

        }
        System.out.println(findMaxSum(myArray));
        temp = null;
        N = 0;
      }
    }

  }

  public static int findMaxSum(int[] myarray) {

    int tempSum = myarray[0];
    int sum = myarray[0];
    for (int i = 1; i < myarray.length; i++) {
      if ((tempSum + myarray[i]) > 0) {
        tempSum = tempSum + myarray[i];
      } else if (tempSum > sum && myarray[i] > 0)
        sum = tempSum;
      if (myarray[i] > tempSum) {
        tempSum = myarray[i];
        sum = myarray[i];
      }

      else if ((tempSum + myarray[i]) <= 0 && myarray[i] < 0) {
        tempSum = 0;
      }

    }
    return sum;
  }

}
