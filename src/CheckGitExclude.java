
public class CheckGitExclude {

  public static void main(String[] args) {
    System.out.println("hello");
    System.out.println("hola Dattu");
    String s1 = new String("dattu");
    String s2 = new String("dattu");
    String s3 = s1.intern();
    String s4 = "dattu";

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1 == s4);
    System.out.println(s3 == s4);

  }

}
