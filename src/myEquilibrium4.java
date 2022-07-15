
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myEquilibrium4 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(br.readLine());

      int[] myArray = new int[n];

      String str = br.readLine();
      String[] strArray = str.trim().split("\\s+");

      for (int i = 0; i < n; i++) {
        myArray[i] = Integer.parseInt(strArray[i]);
      }
      StringBuffer sb = new StringBuffer();
      sb.append(findEquilibrium(myArray, n));

      System.out.println(sb);
    }

    br.close();
  }

  public static int findEquilibrium(int[] myArray, int n) {

    if (n == 1)
      return 1;

    for (int i = 0; i < n; i++) {
      int leftSum = 0, rightSum = 0;
      for (int j = 0; j < i; j++)
        leftSum = leftSum + myArray[j];
      for (int k = i + 1; k < n; k++)
        rightSum = rightSum + myArray[k];

      if (leftSum == rightSum)
        return i + 1;
    }

    return -1;
  }

}
