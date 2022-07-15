
import java.io.*;

public class wildcardmatch {

  public static void main(String[] args) {
    String s = "acdcb";
    String p = "a*c?b";
    wildcardmatch wcm = new wildcardmatch();
    // System.out.println(wcm.isMatch(s,p));

    s = "aa";
    p = "a";
    s = "adceb";
    p = "*a*b";
    s = "cb";
    p = "?a";
    s = "aa";
    p = "*";
    s = "abefcdgiescdfimde";
    p = "ab*cd?i*de";
    // efcdgiescdfim

    System.out.println(wcm.isMatch(s, p));

  }

  public boolean isMatch(String s, String p) {

    int i = 0, j = 0;
    while (i < s.length() && j < p.length()) {
      if (p.charAt(j) == '?') {
        if (j == p.length())
          return true;
        i++;
        j++;
      } else if (p.charAt(j) == '*') {
        if (j + 1 == p.length()) {
          return true;
        }
        while (i < s.length() && s.charAt(i) != p.charAt(j + 1)) {
          i++;
        }
        j++;
      } else if (s.charAt(i) == p.charAt(j)) {
        i++;
        j++;
        continue;
      } else
        return false;
    }
    if (i == s.length() && j == p.length())
      return true;
    else
      return false;

  }
}
