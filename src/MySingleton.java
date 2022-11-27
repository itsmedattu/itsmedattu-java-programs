
public class MySingleton {

  public static void main(String[] args) {
    mySingletonClass mso1=mySingletonClass.getInstance();
    mySingletonClass mso2=mySingletonClass.getInstance();
    System.out.println(mso1==mso2);
    System.out.println(mso1.hashCode()==mso2.hashCode());
  }

}

class mySingletonClass {
  int id;

  private static mySingletonClass mso=null;
  private mySingletonClass() {id=24;};
  public static mySingletonClass getInstance() {
    if(mso==null)
    {
      synchronized (mySingletonClass.class){
        if(mso==null) {
          mso=new mySingletonClass();
        }
      }
    }
    return mso;
  }
}
