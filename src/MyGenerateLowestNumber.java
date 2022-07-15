
public class MyGenerateLowestNumber {
  public static String GenerateLowestNumber(String number, int n) {
    int minIndex = 0;
    StringBuffer minValue = new StringBuffer();
    while (n >= 0) {
      if (n == 0) {
        minValue.append(number);
        return minValue.toString();
      } else if (number.length() <= n) {
        break;
      }
      for (int j = 1; j <= n; j++) {
        if (number.charAt(j) < number.charAt(minIndex)) {
          minIndex = j;
        }
      }
      minValue.append(number.charAt(minIndex));
      number = number.substring(minIndex + 1);
      n = n - minIndex;
      minIndex = 0;
    }

    return minValue.toString();
  }

}
