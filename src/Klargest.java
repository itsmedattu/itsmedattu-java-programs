

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Klargest {
	void print(int []a) {
		for(int i:a)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		int[] arr = {  5,6,1,4,1,8,2,4,1,7,9,3,2,1};
		int k = 4;
		Klargest kl=new Klargest();
		kl.print(kl.getKlargetElements(arr, k));

	}
	int[] getKlargetElements(int[] arr,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>((x,y)->y.compareTo(x));
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		for(int p=0;p<k;p++)
			ts.add(pq.poll());
		Iterator<Integer> itr=ts.descendingIterator();
		int []result=new int[ts.size()];
		int index=0;
		while(itr.hasNext()) {
			result[index]=(int)itr.next();
			index++;
		}
		return result;
	}
}
