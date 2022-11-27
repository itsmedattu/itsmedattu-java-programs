import java.util.HashMap;

public class MyPrac28Nov2022 {
  public static void main(String args[]) {
    myGen<String> obj=new myGen("Dattu");
    System.out.println(obj.getId());
    myGen<Integer> obj2=new myGen(2);
    System.out.println(obj2.getId());

    myGen<String> obj1=new myGen(2);
    System.out.println(obj1.getId());
/*
    HashMap<Integer,String> hm=new HashMap<>();
    hm.put(1,"Dattu");
    hm.put(2, "Prashanth");
    System.out.println(hm);
    hm.put(1, "Ramya");
    System.out.println(hm);
*/
  }
}

class  myGen<T>{
  public T id;
  public T getId() {
    return id;
  }
  public void setId(T id) {
    this.id=id;
  }
  myGen(T id){
    this.id=id;
  }

}
