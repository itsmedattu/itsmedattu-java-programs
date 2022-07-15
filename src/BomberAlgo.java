
public class BomberAlgo {

  public String str;

  public String Bomber(String str) {
    char[] temp = new char[str.length()];
    StringBuilder sb = new StringBuilder();
    int c = 0;
    System.out.println("len is " + str.length());
    for (int i = 0; i < str.length(); i++) {
      System.out.println(" string char is " + i + " " + str.charAt(i));
      int j = i + 1;
      if (j == str.length())
        break;
      if (str.charAt(i) != str.charAt(j)) {
        System.out.println(str.charAt(i));
        temp[c] = str.charAt(i);
        sb.append(temp[c]);
        c++;
      } else {
        System.out.println("else");
        while (str.charAt(i) == str.charAt(j)) {
          i++;
          j++;
          if (j == str.length())
            break;
        }
      }

    }
///		String x=temp.toString();
    // System.out.println(temp);
    System.out.println("strig is " + sb);
    temp[c] = '\0';
    // for(int k=0;k<temp.length-1;k++)
    // System.out.println(temp[k]);
    // System.out.println("len is "+temp.length);

    return null;
  }
}
