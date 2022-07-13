/*
 * import java.util.*; import java.lang.*; import java.io.*;
 * 
 * class Sorting{ int id; String name; Sorting(int id,String name){ this.id=id;
 * this.name=name; } } class sortbyid implements Comparator<Sorting>{
 * 
 * @Override public int compare(Sorting o1, Sorting o2) { // TODO Auto-generated
 * method stub return o1.id-o2.id; }
 * 
 * } class sortbyName implements Comparator<Sorting>{ public int compare(Sorting
 * s1,Sorting s2){ return s1.name.compareTo(s2.name); } } class sortbynameid
 * implements Comparator<Sorting>{ public int compare(Sorting s1,Sorting s2){
 * if(s1.id!=s2.id) return s1.id-s2.id; else return s1.name.compareTo(s2.name);
 * } } public class MyCollections {
 * 
 *//**
	 * @param args
	 *//*
		 * public static void main(String[] args) {;
		 * 
		 * // TODO Auto-generated method stub
		 * System.out.println("lets check collections "); Student s1=new Student(null,
		 * "dattu", null); Student s2=new Student("Annamayya"); ArrayList<Student>
		 * sl=new ArrayList<Student>(); sl.add(s1); sl.add(s2); for(Student s:sl){
		 * System.out.println("name is "+s.name); } Collections.sort(sl);
		 * 
		 * System.out.println("after sorting"); for(Student s:sl){
		 * System.out.println("name is "+s.name); }
		 * 
		 * 
		 * Vector v=new Vector();
		 * System.out.println("size of vector is  "+v.capacity()); v.add(new
		 * Integer(1)); v.add(new Integer(2)); v.add(new String("dattatreya"));
		 * v.add(new Double("14.22")); v.add(new Integer(1)); v.add(new Integer(2));
		 * v.add(new String("dattatreya")); v.add(new Double("14.22")); v.add(new
		 * Integer(1)); v.add(new Integer(2)); v.add(new String("dattatreya"));
		 * v.add(new Double("14.22"));
		 * System.out.println("size of vector is  "+v.capacity());
		 * 
		 * v.add(new Integer(1)); v.add(new Integer(2)); v.add(new
		 * String("dattatreya")); v.add(new Double("14.22"));
		 * 
		 * System.out.println("size of vector is  "+v.capacity());
		 * System.out.println("first element is  "+v.firstElement());
		 * System.out.println("last element is  "+v.lastElement());
		 * 
		 * if(v.contains(new String("dattatreya"))){
		 * System.out.println("yes , dattatreya exists"); } Enumeration e=v.elements();
		 * while(e.hasMoreElements()){ System.out.println(e.nextElement()+" "); }
		 * System.out.println("first element is  "+v.elementAt(1)); display(); } public
		 * static void display(){ Sorting s1=new Sorting(10,"Dheeraj");
		 * 
		 * Sorting s2=new Sorting(2,"Prashanth"); Sorting s3=new Sorting(100,"Pranavi");
		 * Sorting s4=new Sorting(21,"Ramya"); Sorting s5=new Sorting(10,"C"); Sorting
		 * s6=new Sorting(10,"Dattu");
		 * 
		 * ArrayList<Sorting> al=new ArrayList<Sorting>(); al.add(s1); al.add(s2);
		 * al.add(s3); al.add(s4); al.add(s5); al.add(s6); for(int i=0;i<al.size();i++)
		 * System.out.println("id is "+al.get(i).id+" name is "+al.get(i).name);
		 * 
		 * // Collections.sort(al,new sortbyid());
		 * 
		 * Collections.sort(al,new sortbyName());
		 * 
		 * System.out.println("After sorting by name"); for(int i=0;i<al.size();i++)
		 * System.out.println("id is "+al.get(i).id+" name is "+al.get(i).name);
		 * 
		 * Collections.sort(al,new sortbyid());
		 * System.out.println("After sorting by id");
		 * 
		 * for(int i=0;i<al.size();i++)
		 * System.out.println("id is "+al.get(i).id+" name is "+al.get(i).name);
		 * Collections.sort(al, new sortbynameid()); Collections.sort(al,new
		 * sortbyid()); System.out.println("After sorting by id and name");
		 * 
		 * for(int i=0;i<al.size();i++)
		 * System.out.println("id is "+al.get(i).id+" name is "+al.get(i).name);
		 * 
		 * } }
		 * 
		 */