import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallest {

	public static void main(String[] args) {
	int[] array= {50,40,30,20,10};
	kthsmallest ks=new kthsmallest();
	System.out.println(ks.kthsmallest(array,2 ));
	System.out.println(ks.kthlargest(array,3 ));

	}
	
	int kthsmallest(int[] array,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<k;i++)
			pq.add(array[i]);
		
		for(int i=k;i<array.length;i++)
		{
			if(array[i]<pq.peek())
			{
				pq.poll();
				pq.add(array[i]);
			}
		
		}
		return pq.peek();
		
	}
	
	int kthlargest(int[] array,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++)
			pq.add(array[i]);
		
		for(int i=k;i<array.length;i++)
		{
			if(array[i]>pq.peek())
			{
				pq.poll();
				pq.add(array[i]);
			}
		
		}
		return pq.peek();
		
	}


}
