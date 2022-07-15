
import java.util.Arrays;

public class arraypair {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // int array[][]= {{0,10},{5,12}};
    int array[][] = { { 1, 2 }, { 1, 4 }, { 3, 4 } };
    // int array[][]= {{1,4},{3,6},{2,8}};
    // int array[][]= {{3,10},{4,10},{5,12}};
    int cov = 0;
    cov = removeCoveredIntervals(array);
    int covered = 0;
    System.out.print(cov);
    System.exit(0);
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if ((i != j && array[i][0] >= array[j][0]) && (array[i][1] <= array[j][1])) {
          // System.out.println(array[j][0]+" "+array[j][1]);
          System.out.println("covered " + array[i][0] + " " + array[i][1]);
          covered++;
          break;
        }
      }

      //
    }

    System.out.println(array.length - covered + " " + array[0]);

  }

  static int removeCoveredIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sorted based on first element

    int[] currInt = { -1, -1 };
    int result = 0;
    for (int[] interval : intervals) {
      if (currInt[0] < interval[0] && currInt[1] < interval[1]) {
        result++;
        currInt[0] = interval[0];
      }

      currInt[1] = Math.max(currInt[1], interval[1]);
    }

    return result;
  }
}
