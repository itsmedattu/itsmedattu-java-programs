
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mySpecialSort012 {

  public static void main(String[] args) throws Exception {

    int N = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    @SuppressWarnings("resource")

    int T = Integer.parseInt(br.readLine());
    if (T <= 0) {
      System.out.println("wrong input");
      System.exit(0);
    }

    for (int i = 0; i < T; i++) {
      N = Integer.parseInt(br.readLine());
      if (N <= 0) {
        System.exit(0);
      }
      int[] myArray = new int[N];
      int countZero = 0;
      int countOne = 0;
      int countTwo = 0;
      String[] temp = br.readLine().split("\\s+");
      for (String str : temp) {
        if (str.equals("0")) {
          countZero++;
        } else if (str.equals("1")) {
          countOne++;
        } else if (str.equals("2")) {
          countTwo++;
        }
      }

      int counter = 0, p;
      for (p = 0; p < countZero; p++) {
        myArray[counter] = 0;
        counter++;
      }
      for (p = 0; p < countOne; p++) {
        myArray[counter] = 1;
        counter++;
      }
      for (p = 0; p < countTwo; p++) {
        myArray[counter] = 2;
        counter++;
      }
      N = 0;
      for (p = 0; p < myArray.length; p++) {
        System.out.print(myArray[p] + " ");
      }

    }
  }

}
