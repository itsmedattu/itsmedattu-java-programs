

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class myHashMap {

	public static void main(String[] args) {
		System.out.println();
		System.out.println(2<5);
		System.out.println(2>5);
		myHashMap mh=new myHashMap();
		mh.createPriorityQueue();
		System.exit(0);
		String[] strs= {"dtatu","Pranavi","Prem"};
		for(String s:strs) {
			System.out.println(s);
		}
		try {
		mh.myhashmap();
		}catch(Exception e) {
			System.out.println("exception");
		}
	}

	
	public void myhashmap() throws Exception 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Dattu");
		hm.put(7, "Dattu7");
		hm.put(8, "Dattu8");
		hm.put(9, "Dattu9");
		hm.put(2, "Dattu2");
		
		
		Stack mys=createStack(hm);
		System.out.println(" stack is "+mys);
		System.exit(0);
		System.out.println(" 8 key and value is "+hm.get(8)+" sie "+hm.size());
		System.out.println(hm.remove(7));
        System.out.println("values are ");
		System.out.println(hm.entrySet());
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		for(Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
			
			if(e.getValue().equals("Dattu2")) {
			    e.setValue("dattu2");
			}
		}
		System.out.println(getCapacity(hm));
		System.out.println(hm);
		System.out.println(hm.entrySet());
	}
	
    int getCapacity(HashMap al) throws Exception {
        Field field = HashMap.class.getDeclaredField("DEFAULT_INITIAL_CAPACITY");
        field.setAccessible(true);
      //  field.setInt(al, 22);
        return ((int) field.get(al));

    }
    
    public Stack createStack(HashMap<Integer,String> hm) {
    	System.out.println("given hashmap "+hm);
    	Stack<String> s=new Stack<>();
    	for(Map.Entry<Integer, String> e: hm.entrySet()) {
    		s.push(e.getValue());
    		
    	//	s.push(e.getKey().toString());
    	}
    	System.out.println("stack is "+s);
        System.out.println("popped valueis "+s.pop());
    	System.out.println("post pop stack is "+s);
        System.out.println(" top is "+s.peek());
        
        return s;
    	
    }
    
    public void createPriorityQueue() {
    	PriorityQueue<String>  pq=new PriorityQueue<>();
    	Comparator<Integer> cc=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
				
			}
		};
        	pq.add("Pranavi");
    	pq.add("Prem");
     	pq.add("Dattu"); 	
     	pq.add("Amithab Bachan");
     	pq.add("Chiranjeevi");
     	pq.add("Chiranjeevi");
     	pq.add("Ramya");
     	pq.add("Balakrishna");
     	
     	
    	
    	
    	System.out.println("PQ is "+pq);
    	System.out.println(pq.poll());
    	System.out.println(pq.poll());
    	System.out.println(pq.poll());
    	System.out.println(pq.poll());
    	System.out.println("poll on priority queue "+pq.poll());
    	System.out.println(pq.peek());
    	System.out.println("PQ is "+pq);
    	
	PriorityQueue<Integer>  pq1=new PriorityQueue<>(cc);
        
    	pq1.add(5);
    	pq1.add(7);
     	pq1.add(3); 	
     	pq1.add(1);
     	pq1.add(9);
     	pq1.add(100);
     	pq1.add(16);
     	
     	
    	
    	
    	System.out.println("pq1 is "+pq1);
    	System.out.println(pq1.peek());
    	System.out.println("poll on priority queue "+pq1.poll());
    	System.out.println(pq1.poll());
    	System.out.println(pq1.poll());
    	System.out.println(pq1.poll());
    	System.out.println(pq1.poll());
    	System.out.println(pq1.poll());
    	System.out.println("pq1 is "+pq1);
    	
    	
    	
    }
 
     
   
}


