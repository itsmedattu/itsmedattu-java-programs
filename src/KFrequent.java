
import java.util.*;

class Pair {
  Integer count;
  String val;

  Pair(String val, Integer count) {
    this.val = val;
    this.count = count;
  }

  Pair() {

  }
}

public class KFrequent {

  public static void main(String[] args) {

    String[] input1 = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
    KFrequent kf = new KFrequent();
    String[] input4 = { "a", "aa", "aaa" };
    System.out.println(kf.topKFrequent(input4, 3));

    System.out.println(kf.topKFrequent(input1, 4));

    String[] input2 = { "i", "love", "leetcode", "i", "love", "coding" };
    System.out.println(kf.topKFrequent(input2, 3));

    String[] input3 = { "i", "love", "leetcode", "i", "love", "coding" };
    System.out.println(kf.topKFrequent(input3, 2));

  }

  public List<String> topKFrequent(String[] words, int k) {
    List<String> l = new ArrayList<String>(k);
    Arrays.sort(words);
    if (k == words.length) {
      for (String w : words)
        l.add(w);
      return l;
    }

    TreeSet<Pair> ts = new TreeSet<Pair>(new Comparator<Pair>() {
      @Override
      public int compare(Pair o1, Pair o2) {
        if (o1.count == o2.count)
          return o1.val.compareTo(o2.val);
        return o2.count.compareTo(o1.count);
      }
    });
    int i = 0;
    while (i < words.length) {
      Pair p = new Pair(words[i], 1);
      while (i < words.length - 1 && words[i].equals(words[i + 1])) {
        p.count++;
        i++;
        continue;
      }

      ts.add(p);
      i++;
    }

    int c = 0;
    for (Pair p1 : ts) {
      if (c == k)
        break;
      l.add(p1.val);
      c++;
    }
    return l;

  }

}
