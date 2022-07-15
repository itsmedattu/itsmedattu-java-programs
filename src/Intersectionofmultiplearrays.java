import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Intersectionofmultiplearrays {

  public static void main(String[] args) {

    Intersectionofmultiplearrays obj = new Intersectionofmultiplearrays();
    int[][] arrays = { { 3, 1, 2, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
    List<Integer> l = obj.intersection(arrays);
    System.out.println(l);

  }

  List<Integer> intersection(int[][] arrays) {

    ArrayList<Integer> result = new ArrayList<>();
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for (int i = 0; i < arrays.length; i++) {
      for (int j = 0; j < arrays[i].length; j++) {
        if (hm.containsKey(arrays[i][j])) {
          hm.put(arrays[i][j], hm.get(arrays[i][j]) + 1);
        } else
          hm.put(arrays[i][j], 1);
      }
    }
    for (Entry<Integer, Integer> e : hm.entrySet()) {
      if (e.getValue() == arrays.length) {
        result.add(e.getKey());
      }

    }
    return result;
  }

}
