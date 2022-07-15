
public class CopyOfBomberAlgonew {

  public String str;

  public StringBuilder Bomber(StringBuilder str) {
    // System.out.println("string is "+str);
    boolean check = isBomber(str);
    if (check) {
      // System.out.println("valid");
    } else {
      // System.out.println("not valid");
    }
    int i = 1;
    System.out.print("Step " + i + ": " + str);
    while (isBomber(str)) {
      System.out.print("\n");
      str = this.Bomb(str);
      i++;
      System.out.print("Step " + i + ": " + str);
    }
    System.out.print(" (Final Answer)");

    return str;
  }

  public StringBuilder Bomb(StringBuilder str) {
    char[] temp = new char[str.length()];
    StringBuilder sb = new StringBuilder();
    int c = 0;
    // System.out.println("len is "+str.length());

    for (int i = 0; i < str.length(); i++) {
      // System.out.println(" string char is "+i+" "+str.charAt(i));
      int j = i + 1;
      if (j == str.length())
        break;
      if (str.charAt(i) != str.charAt(j)) {
        // System.out.println(str.charAt(i));
        temp[c] = str.charAt(i);
        sb.append(temp[c]);
        c++;
      } else {
        // System.out.println("else");

        while (str.charAt(i) == str.charAt(j)) {
          i++;
          j++;
          if (j == str.length())
//					System.out.print("breaking");
            break;
        }
        i++;
        while (i < str.length()) {
          sb.append(str.charAt(i));
          i++;
        }
//				System.out.println(" string new is "+sb);
      }

    }
///		String x=temp.toString();
    // System.out.println(temp);
    // System.out.println("strig is "+sb);
    // temp[c]='\0';
    // for(int k=0;k<temp.length-1;k++)
    // System.out.println(temp[k]);
    // System.out.println("len is "+temp.length);

    return sb;
  }

  private boolean isBomber(StringBuilder str) {
    // TODO Auto-generated method stub
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        return true;
      }
    }
    return false;
  }
}
