
public class RemoveAdjacent {

  char[] removeAdj(char[] strArray, int len) {
    if (len == 0) {
      return strArray;
    }

    for (int i = 1; i < strArray.length; i++) {
      if (i == strArray.length - 1) {
        return removeAdj(strArray, 0);
      }
      if (strArray[i] == strArray[i - 1]) {

        if (strArray[i - 1] == '\0') {
          if (i - 1 == len)
            return removeAdj(strArray, 0);
          continue;
        }

        while (i < strArray.length - 1) {
          strArray[i - 1] = strArray[i + 1];
          i++;
        }
        strArray[i - 1] = '\0';
        strArray[i] = '\0';
        return removeAdj(strArray, len - 2);
      }
    }

    return null;

  }
}
