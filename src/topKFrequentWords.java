
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentWords {

  public class tuple {
    int count = 1;
    String val;

    tuple(String in) {
      this.val = in;
    }

    tuple(String s, int c) {
      this.val = s;
      this.count = c;
    }
  }

  static class wordCompare implements Comparator<tuple> {

    @Override
    public int compare(tuple o1, tuple o2) {
      if (o1.count > o2.count)
        return 1;
      else if (o1.count < o2.count) {
        return -1;
      }
      return 0;
    }
  }

  public List<String> topKFrequent(String[] words, int k) {

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    for (String word : words) {
      hm.put(word, hm.getOrDefault(word, 0) + 1);
    }

    PriorityQueue<tuple> pq = new PriorityQueue<tuple>(new wordCompare());

    for (Map.Entry<String, Integer> e : hm.entrySet()) {
      pq.offer(new tuple(e.getKey(), e.getValue()));
      // System.out.println(e.getKey());
      // System.out.println(e.getValue());
      if (pq.size() > k) {
        System.out.println();
        System.out.println(e.getKey());
        pq.poll();
      }
    }

    ArrayList<tuple> result = new ArrayList<tuple>(pq.size());
    for (Map.Entry<String, Integer> e : hm.entrySet()) {
      result.add(new tuple(e.getKey(), e.getValue()));
    }

    result.sort(new Comparator<tuple>() {
      public int compare(tuple t1, tuple t2) {
        int result = 0;
        if (t1.count == t2.count) {
          result = t1.val.compareTo(t2.val);
          return result;
        } else {
          if (t1.count > t2.count)
            result = -1;
          else if (t1.count < t2.count)
            result = 1;
        }
        return result;
      }
    });
    List<String> output = new ArrayList<String>();
    for (tuple t : result)
      output.add(t.val);

    return output;
  }

  public static void main(String[] args) {
    topKFrequentWords tf = new topKFrequentWords();

    String[] input1 = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
    // String[] input2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny",
    // "is", "is"} ;
    // List<String> out = topKFrequent(input2,2) ;

    List<String> out = tf.topKFrequent(input1, 2);
    for (String str : out) {
      System.out.print(str + " ");
    }

  }
}
