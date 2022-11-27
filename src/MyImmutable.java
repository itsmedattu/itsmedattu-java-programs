
public class MyImmutable {

  public static void main(String[] args) {
    String s1="Dattu";
    String s2="Dattu";
    String s3=new String("Dattu");//.intern();
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1.equals(s2));
    System.out.println(s1==s3.intern());

   
    System.exit(0);
    myImmutableClass obj=new myImmutableClass(2);
    System.out.println(obj.getID());
    
  }

}

final class myImmutableClass {
  private int id;
  public myImmutableClass (int id) {
    this.id=id;
  }
  public int getID() {
    return this.id;
  }
}
