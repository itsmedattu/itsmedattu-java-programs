
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class myMissingNumberArray2 {
  public static void main(String[] args) {
    int T = 0;
    int N = 0;
    Scanner sc = new Scanner(System.in);
    T = sc.nextInt();

    ArrayList<Integer> Tlist = new ArrayList<>();
    System.out.println("Output of Online Judge is:");
    for (int i = 0; i < T; i++) {
      N = 0;
      N = sc.nextInt();
      for (int j = 0; j < N - 1; j++) {
        Tlist.add(sc.nextInt());
      }

      Tlist.sort(new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
          // TODO Auto-generated method stub
          return o1.compareTo(o2);
        }

      });

      System.out.println(findMissing(Tlist));
      // System.out.println(findmissingNumberinArray(Tlist, N));
      Tlist.clear();
    }

    sc.close();

  }

  public static int findmissingNumberinArray(ArrayList<Integer> myarray, int N) {
    int sum = 0;
    for (int i = 0; i < N - 1; i++)
      sum = sum + myarray.get(i);
    return (N * (N + 1) / 2) - sum;
  }

  public static int findMissing(ArrayList<Integer> myList) {
    int i = 0;
    for (; i < myList.size(); i++) {
      if (myList.get(i) + 1 != myList.get(i + 1)) {
        return myList.get(i) + 1;
      }
    }
    return i;
  }
}
