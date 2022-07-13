import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;




public class myCollectionsnow {
	private static final boolean Integer = false;
	String name;
	int number;
	myCollectionsnow() {
		name="dattu";
		number=3;
	}
	public void printValues(){
		System.out.println("name :"+name);
		System.out.println("number :"+number);		
	}
	public void myArraylist(){
		ArrayList al=new ArrayList();
		System.out.println("size of arraylist : "+al.size());
		al.add("dattu");
		al.add("3");
		al.add("Prashanth");
		al.add("Ramya");
		al.add("Pranavi");
		al.add("Pooji");
		System.out.println("size of arraylist is :"+al.size());
		/*System.out.println("values of the arraylist");
		System.out.println(al);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		*/
		System.out.println("values are ( using iterator)");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
				System.out.println(itr.next());
		}
		
		//modifying list values
		System.out.println("list of valus using listiterator");
		java.util.ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			Object myo=li.next();
			li.set(myo+ "...");
			//System.out.println(myo);
		}
		itr=al.iterator();
		while(itr.hasNext())
		{
			Object myo=itr.next();
			System.out.println(myo+ " ");
		}
		//display in backwards
		System.out.println("printing values in backwards");
	while(li.hasPrevious()){
		Object myo=li.previous();
		System.out.println(myo);
	}
	
	while(li.hasNext()){
		Object myo=li.next();
		if(myo.equals("3...")){
			System.out.println("its 3");
			li.remove();
		}
	}
	itr=al.iterator();
	System.out.println("values after deleting the value 3 ares");
	while(itr.hasNext()){
//		Object myo=itr.next();
		System.out.println(itr.next());
	}	
	}
	
	public void mylinkedlist(){
		List<Integer> ll=new LinkedList<>();
		ll.add(21);
		ll.add(42);
		ll.add(91);
		
		Iterator< Integer> itr=ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("printing using for loop");
		
		for(Integer myalye:ll){
			System.out.println(myalye);
		}
	//	ll.forEach(System.out::println);
//		ll.forEach(System.out::println);
	}
	
	public void myVector(){
		Vector<Integer> myv=new Vector<Integer>();
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(34);
		myv.add(22);
		myv.add(100);
		System.out.println("capacity of vector is "+myv.capacity());
		for(int i:myv)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("value at 10th position :"+myv.get(10));
		myv.remove(10);
		System.out.println("value at 10th position :"+myv.get(10));
		System.out.println("values using iterator");
		Iterator<Integer> itr=myv.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
	}
	
	
	public void mystack(){
		Stack<String> mystack=new Stack<>();
		System.out.println("capacity of stack is : "+mystack.capacity());
		System.out.println("size of the stack is : "+mystack.size());
		mystack.add("Dattatreya");
		mystack.add("Prashanth");
		mystack.add("Ramya");
		mystack.add("Pranavi");
		mystack.add("Pooji");
		mystack.add("Dattatreya");
		mystack.add("Prashanth");
		mystack.add("Ramya");
		mystack.add("Pranavi");
		mystack.add("Pooji");
		System.out.println("top is : "+mystack.peek());
		System.out.println("deleting top value : "+mystack.pop());
		System.out.println("top value is : "+mystack.peek());
		System.out.println("size is "+mystack.size());

		mystack.add("AmmaNanna");
		mystack.add("Dattatreya");
		mystack.add("Prashanth");
		mystack.add("Ramya");
		mystack.add("Pranavi");
		mystack.add("Pooji");
		mystack.add("Dattatreya");
		mystack.add("Prashanth");
		mystack.add("Ramya");
		mystack.push("dattu");
		mystack.add("Pranavi");
		mystack.add("Pooji");
		mystack.add("AmmaNanna");
		
		System.out.println("values have been added to stack");		
		System.out.println("capacity of stack is "+mystack.capacity());
		System.out.println("size of the stack is : "+mystack.size());
		System.out.println("top is : "+mystack.peek());
		System.out.println("deleting top value : "+mystack.pop());
		System.out.println("top value is : "+mystack.peek());
		System.out.println("size is "+mystack.size());

		
		System.out.println("values from mystack are ");
		for(String str:mystack) {
			System.out.print(str+ " ");
		}
		System.out.println();
		
		System.out.println("10th value is "+mystack.get(10));
		mystack.remove(10);
		//mystack.remove(11);
		//mystack.remove(12);
		System.out.println("10th value is "+mystack.get(10));
		System.out.println("capacity of stack is "+mystack.capacity());
		System.out.println("size of the stack is : "+mystack.size());
		
		System.out.println(mystack.contains("Dattatreya"));
		System.out.println(mystack.contains("Dattatreya1"));
		mystack.clone();
		
		Stack<String> so=(Stack<String>)mystack.clone();
		so.clear();
		try {
		System.out.println("capacity of new stack is "+so.capacity());
		System.out.println("is stack empty :"+so.empty());
		System.out.println("size of new stack us "+so.size());
		System.out.println("10th value is "+so.get(10));
		so.push("Dattu");
		} 
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("array index out of bound excepion");
		}
		so.push("dattu");
		so.push("dattatreya");
		System.out.println("size is : "+so.size());
		System.out.println("top is : "+so.peek());
		System.out.println("deleting top value : "+so.pop());
		System.out.println("to value is : "+so.peek());
		System.out.println("size is "+so.size());
		
	}

	public void myqueue() {
		Queue<Integer> myQ=new LinkedList<Integer>();
		System.out.println("size : "+myQ.size());
		myQ.add(21);
		myQ.add(12);
		myQ.add(9);
		myQ.add(12);
		myQ.add(21);
		myQ.add(12);
		System.out.println("values have been inserted into the queue");
		System.out.println("size : "+myQ.size());
		System.out.println("values are ");
		for(int x:myQ)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("peek :"+myQ.peek());
		System.out.println("poll , removing "+myQ.poll());
		System.out.println("poll , removing "+myQ.poll());
		System.out.println("peek is "+myQ.peek());
		Iterator<Integer> itr=myQ.iterator();
		System.out.println("values using iterator");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		System.out.println();		
	}
	
	public void myProirotyQueue() {
		PriorityQueue<Integer> myPQ=new PriorityQueue<Integer>();
		System.out.println("priority queue size is : "+myPQ.size());
		myPQ.add(3);
		myPQ.add(1);
		System.out.println("values are");
		for(int i:myPQ)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();

		myPQ.add(6);
		System.out.println("values are");
		for(int i:myPQ)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();

		myPQ.add(5);
		myPQ.add(4);
		myPQ.add(2);
		System.out.println("priority queue size is : "+myPQ.size());
		System.out.println("values are");
		for(int i:myPQ)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();

		System.out.println("peek is : "+myPQ.peek());
		System.out.println("removing : "+myPQ.poll());
		System.out.println("peek : "+myPQ.peek());
		System.out.println("values are");
		for(int i:myPQ)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("peek is : "+myPQ.peek());
		System.out.println("removing : "+myPQ.poll());
		System.out.println("peek : "+myPQ.peek());
		System.out.println("values are");
		for(int str:myPQ)
		{
			System.out.print(str + " ");
		}
		
		System.out.println();

	}
	
	public void myDequeue() {
		Deque<Integer> myDQ=new ArrayDeque<Integer>();
		//Deque<Integer> myDQ=new LinkedList<Integer>();
		myDQ.add(1);
		myDQ.add(5);
		myDQ.add(2);
		myDQ.add(4);
		myDQ.add(9);
		myDQ.add(3);
		myDQ.add(15);
		myDQ.add(7);
		myDQ.add(8);
		myDQ.add(6);
		System.out.println("values have been inserted into deque");
		System.out.println("peek is "+myDQ.peek());
		System.out.println("values are");
		for(int i:myDQ){
			System.out.print(i + " ");
		}
		
		System.out.println();
		myDQ.removeFirst();
		myDQ.removeLast();
		myDQ.addFirst(87);
		myDQ.addLast(56);
		myDQ.remove();
		myDQ.poll();
		
		System.out.println("values are");
		for(int i:myDQ){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("printing values using iterator");
		Iterator itr=myDQ.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
	}

	public void myHashSet()
	{
		Set<Integer> myS=new HashSet<Integer>();
		myS.add(12);
		myS.add(45);
		myS.add(2);
		myS.add(21);
		myS.add(67);
		myS.add(46);
		myS.add(45);
		myS.add(19);
		myS.add(2);
		
		System.out.println("values have been added to hash set");
		System.out.println("size is : "+myS.size());

		System.out.println("values are");
		Iterator itr=myS.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		myS.remove(19);	
//		myS.forEach(System.out::println);
		itr=myS.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
	}
	public void myLinkedHashSet()
	{
		LinkedHashSet<Integer> myLHS=new LinkedHashSet<Integer>();
		myLHS.add(12);
		myLHS.add(45);
		myLHS.add(2);
		myLHS.add(21);
		myLHS.add(67);
		myLHS.add(46);
		myLHS.add(45);
		myLHS.add(19);
		myLHS.add(2);
		
		System.out.println("values have been added to hash set");
		System.out.println("size is : "+myLHS.size());

		System.out.println("values are");
		Iterator itr=myLHS.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		myLHS.remove(19);	
//		myLHS.forEach(System.out::println);
		itr=myLHS.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
	}
	
	public void myTreeSet()
	{
		SortedSet<Integer> myTS=new TreeSet<Integer>();
		//TreeSet<Integer> myTS=new TreeSet<Integer>();
		//NavigableSet<Integer> myTS=new TreeSet<Integer>();
		myTS.add(12);
		myTS.add(45);
		myTS.add(2);
		myTS.add(21);
		myTS.add(67);
		myTS.add(46);
		myTS.add(45);
		myTS.add(19);
		myTS.add(2);
		
		System.out.println("values have been added to hash set");
		System.out.println("size is : "+myTS.size());

		System.out.println("values are");
		Iterator itr=myTS.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println(myTS.headSet(19));
		System.out.println(myTS.tailSet(19));
		

//		myLHS.forEach(System.out::println);
		itr=myTS.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
	}	
	
	public void myHashMap() {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Dattatreya", 1);
		hm.put("Prashanth", 2);
		hm.put("Dattu",3);
		hm.put("Dattu", 3);
		for(String str:hm.keySet()) {
			System.out.println(str+" "+hm.get(str));
		}
		
		printHashMap(hm);
	}
	public void printHashMap(HashMap<String,Integer> map){
		if(map.isEmpty())
		{
			System.out.println("hashmap is empty");
		}
		else 
		{
			Iterator<String> hmitr=map.keySet().iterator();
			System.out.println("using iterator");
			while(hmitr.hasNext())
			{
				System.out.print(hmitr.next()+" ");
			}
			System.out.println();
			Set<Entry<String,Integer>> hashSet=map.entrySet();
			for(Entry<String, Integer> e:hashSet)
			{
				System.out.println("key : "+e.getKey()+" value :"+e.getValue());
			}
			System.out.println(map);
		}
	}
	
	public void myHashTable() {
		Hashtable<String,Integer> hm=new Hashtable<String,Integer>();
		System.out.println("Hashtable");
		hm.put("Dattatreya", 1);
		hm.put("Prashanth", 2);
		hm.put("Dattu",3);
		hm.put("Dattu", 3);
		//hm.put(null, 24);
		for(String str:hm.keySet()) {
			System.out.println(str+" "+hm.get(str));
		}
		Set<Entry<String,Integer>> s=hm.entrySet();
		System.out.println("entryset");
		System.out.println();
		for(Entry e1:s)
		{
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
	}

	public void myLinkedHashMap() {
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		System.out.println("Hashtable");
		hm.put("Dattatreya", 1);
		hm.put("Prashanth", 2);
		hm.put("Dattu",3);
		hm.put("Dattu", 3);
		//hm.put(null, 24);
		for(String str:hm.keySet()) {
			System.out.println(str+" "+hm.get(str));
		}
		Set<Entry<String,Integer>> s=hm.entrySet();
		System.out.println("entryset");
		System.out.println();
		for(Entry e1:s)
		{
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
	}
	public void myTreeMap() {
		TreeMap<String,Integer> hm=new TreeMap<String,Integer>();
		System.out.println("Hashtable");
		hm.put("Dattatreya", 1);
		hm.put("Prashanth", 2);
		hm.put("Dattu",3);
		hm.put("Dattu", 3);
		//hm.put(null, 24);
		for(String str:hm.keySet()) {
			System.out.println(str+" "+hm.get(str));
		}
		Set<Entry<String,Integer>> s=hm.entrySet();
		System.out.println("entryset");
		System.out.println();
		for(Entry e1:s)
		{
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
	}
	//use functions for display, better 

/*	public void myComparable() 
	{
		Employee e1=new Employee("dattu", 1);
		Employee e2=new Employee("dattatreya", 99);
		Employee e3=new Employee("Prashanth", 2);
		Employee e4=new Employee("Ramya", 3);
		Employee e5=new Employee("Pranavi", 8);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		
		java.util.Collections.sort(al);
		
		for(Employee e:al)
		{
			System.out.println(e.name+" "+e.id);
		}
	}*/
	public void myComparator() 
	{
		Student s1=new Student(1,"dattu", 10);
		Student s2=new Student(5,"dattatreya", 5);
		Student s3=new Student(2,"Prashanth", 9);
		Student s4=new Student(3, "Ramya", 3);
		Student s5=new Student(9,"Pranavi", 8);
		
		ArrayList<Student> sl=new ArrayList<Student>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(s5);

		for(Student e:sl)
		{
			System.out.println(e.name+" "+e.rollno+" "+e.classnumber);
		}
		System.out.println();
		java.util.Collections.sort(sl,new nameComparator());
		System.out.println();
		System.out.println("sort by name");
		for(Student e1:sl)
		{
			System.out.println(e1.name+" "+e1.rollno+" "+e1.classnumber);
		}
		
		java.util.Collections.sort(sl, new rollnoComparator());
		System.out.println();
		System.out.println("sort by roll no");
		for(Student e1:sl)
		{
			System.out.println(e1.name+" "+e1.rollno+" "+e1.classnumber);
		}
		
	}
	//use functions for display, better 
}

class Employee1 implements Comparable<Employee1>
{
	String name;
	Integer id;
	public Employee1(String n,Integer i)
	{
		this.name=n;
		this.id=i;
	}
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
		{
			return -1;
		}
		return 0;
	}
}


class Student
{
	Integer rollno;
	String name;
	Integer classnumber;
	public Student(Integer rollno,String name,Integer classnumber)
	{
		this.rollno=rollno;
		this.name=name;
		this.classnumber=classnumber;
	}
}



class nameComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
//		System.out.println("return value is "+s1.name.compareTo(s2.name));
		return s1.name.compareToIgnoreCase(s2.name);
	}	
}

class rollnoComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
//		System.out.println("return value is "+s1.name.compareTo(s2.name));
		if(s1.rollno==s2.rollno)
			return 0;
		else if(s1.rollno>s2.rollno)
			return 1;
		else 
			return -1;
	}	
}
