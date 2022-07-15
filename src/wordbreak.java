
import java.util.ArrayList;
import java.util.List;

public class wordbreak {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "leetcode";
    List<String> wordDict = new ArrayList<String>();
    wordDict.add("leet");
    wordDict.add("code");
    wordbreak wb = new wordbreak();
    boolean isTrue = wb.wordBreaknew1(wordDict, s);
    System.out.println("word " + s + " dict " + wordDict + " can be segmented " + isTrue);
    wordDict = null;
    List<String> wordDict1 = new ArrayList<String>();
    String s1 = "applepenapple";
    wordDict1.add("apple");
    wordDict1.add("pen");

    // wordDict1.add("apple");
    isTrue = wb.wordBreaknew1(wordDict1, s1);
    System.out.println("word " + s1 + " dict " + wordDict1 + " can be segmented " + isTrue);
    List<String> wordDict2 = new ArrayList<String>();
    String s2 = "catsanddog";
    wordDict2.add("cats");
    wordDict2.add("dog");
    wordDict2.add("sand");
    wordDict2.add("cat");
    isTrue = wb.wordBreaknew1(wordDict2, s2);
    System.out.println("word " + s2 + " dict " + wordDict2 + " can be segmented " + isTrue);
    List<String> input = new ArrayList<String>();
    input.add("a");
    input.add("b");
    input.add("bbb");
    input.add("bbbb");
    System.out.println("args = " + wb.wordBreaknew1(input, "bb"));
    List<String> wordDict3 = new ArrayList<String>();
    String s3 = "cars";
    wordDict3.add("cars");
    wordDict3.add("ca");
    wordDict3.add("rs");
    isTrue = wb.wordBreaknew1(wordDict3, s3);
    System.out.println("word " + s3 + " dict " + wordDict3 + " can be segmented " + isTrue);

  }

  boolean wordBreaknew(List<String> wordDict, String s) {
    boolean isTrue = false;
    for (int i = 0; i < s.length(); i++) {
      boolean isValid = false;
      for (int j = 0; j < wordDict.size(); j++) {
        int counter = 0;

        if (wordDict.get(j).charAt(0) != s.charAt(i)) {
          if (j == wordDict.size() - 1)
            return false;
          continue;
        }

        for (int k = 0; k < wordDict.get(j).length(); k++) {

          isValid = false;
          while (wordDict.get(j).charAt(k) == s.charAt(i)) {
            i++;
            k++;
            counter++;
            if (i == s.length())
              return true;
            if (k == wordDict.get(j).length()) {
              k = k - counter + 1;
              isValid = true;
              if (i == s.length())
                return true;
              else
                break;
            }
            ;
          }
          if (!isValid)
            i = i - counter;
          else
            break;
        }

      }
      i = i--;

    }
    return false;
  }

  boolean wordBreak(List<String> wordDict, String s) {
    boolean isTrue = false;
    for (int i = 0; i < s.length(); i++) {
      boolean isValid = false;
      for (int j = 0; j < wordDict.size(); j++) {
        int counter = 0;

        if (wordDict.get(j).charAt(0) != s.charAt(i)) {
          if (j == wordDict.size() - 1)
            return false;
          continue;
        }

        for (int k = 0; k < wordDict.get(j).length(); k++) {

          isValid = false;
          while (wordDict.get(j).charAt(k) == s.charAt(i)) {
            i++;
            k++;
            counter++;
            if (i == s.length())
              return true;
            if (k == wordDict.get(j).length()) {
              k = k - counter + 1;
              isValid = true;
              if (i == s.length())
                return true;
              else
                break;
            }
            ;
          }
          if (!isValid)
            i = i - counter;
          else
            break;
        }

      }
      i = i--;

    }
    return false;
  }

  boolean wordBreaknew1(List<String> wordDict, String s) {
    boolean isTrue = false;
    for (int j = 0; j < wordDict.size(); j++) {
      String s1 = new String(s);
      if (s1.equals(wordDict.get(j)) || wordDict.get(j).contains(s1))
        return true;
      while (j < wordDict.size() && s.contains(wordDict.get(j))) {
        s1 = s1.replaceFirst(wordDict.get(j), "");

        if (s1.equals("") && j == wordDict.size() - 1)
          return true;
        j++;
        isTrue = true;

      }

      s = new String(s1);
    }

    return false;
  }
}