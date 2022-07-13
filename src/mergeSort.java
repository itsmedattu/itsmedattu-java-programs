

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class mergeSort {
	static int[] newArray;
	public static void main(String[] args) {
		int[] Array= {1,3,2,4,6,5,11,9,7,15};
		int []Array1= {1,1,5,5,6,8};
		int []Array2= {1,3,5,5,6,8,9};
		mergeSort obj=new mergeSort();
		int [] intersection=obj.intersecction(Array1, Array2);
		for(int i:intersection) {
			System.out.print(i+" ");
		}

	//	obj.MergeSortHeper(Array);
	}
	void MergeSortHeper(int []Array) {
		newArray=new int[Array.length];
	//	for(int i:Array)
	//		System.out.print(i+" ");
	//	System.out.println();
		mergeSort(Array,0,Array.length-1);
	//	for(int i:Array)
	//		System.out.print(i+" ");

	}
	void merge (int[] Left,int[] Right,int[] Result )
	{
		int i=0,j=0,k=0;
		while(i<Left.length&&j<Right.length)
		{
			if(Left[i]<Right[j]){
				Result[k++]=Left[i++];
			}
			else {
				Result[k++]=Right[j++];
			}
		}
		while(i<Left.length)
			Result[k++]=Left[i++];
		while(j<Right.length)
			Result[k++]=Right[j++];       			
	}

	void mergeSort(int[] array,int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;

			mergeSort(array,start,mid);
			mergeSort(array,mid+1,end);
			merge(array,start,mid,end);
		}
	}
	void merge (int[] Array,int start,int mid,int end )
	{
		//System.out.println("\nstart:"+start+" mid:"+mid+" end:"+end);
		int i=start,j=mid+1,k=start;

		while(i<=mid&&j<=end)
		{
			if(Array[i]<=Array[j])
				newArray[k++]=Array[i++];
			else 
				newArray[k++]=Array[j++];

		}
		while(j<=end) 
			newArray[k++]=Array[j++];

		while(i<=mid) 
			newArray[k++]=Array[i++];


		for(k=start;k<=end;k++)
			Array[k]=newArray[k];

	}
	int[] intersecction (int[] Left,int[] Right )
	{
		
		TreeSet<Integer> intersection=new TreeSet<Integer>();
		int i=0,j=0;
		while(i<Left.length&&j<Right.length)
		{
			if(Left[i]==Right[j]){
				intersection.add(Left[i]);
				i++;
				j++;
			}
			else if(Left[i]<Right[j]){
				i++;
			}
			else {
				j++;
			}	
			
		}
		return intersection.stream().mapToInt(Integer::intValue).toArray();
		
	}


	
}