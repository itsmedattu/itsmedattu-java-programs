

import java.util.TreeSet;

public class MergeKsortedArrays {

	class temp{
		int i;
		int j;	
	}
	public static void main(String[] args) {

		MergeKsortedArrays mks=new MergeKsortedArrays();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		int[][] arr= {{3,5,7},{2,4,6,8},{7,9,10,11}};
		System.out.println(arr.length);
		int[] indexArray=new int[arr.length];
		while(true) {
			temp t=mks.findMinIndex(arr,indexArray);
			if(t!=null) {
			
			ts.add(arr[t.i][t.j]);
			//	System.out.print(t.i+" "+t.j);
		
			arr[t.i][t.j]=-1;
			indexArray[t.i]++;
			
			if(t.i==-1)
				break;
			}
			else
				break;
		}
		for(int i:ts)
			System.out.print(i+" ");

	}
	temp findMinIndex(int[][] arr, int[] indexArray) {
		int min=0,i=0,k=0;
		temp t=new temp();

       while(i<indexArray.length) {
    	   if(arr[i][indexArray[i]]!=-1) {
    			min=arr[i][indexArray[i]];
    			t.i=i;
    			t.j=indexArray[i];  
    			break;
    	   }
    	   else i++;
       }
        
       
		for(;i<arr.length;i++) {
			if(arr[i][indexArray[i]]==-1) 
				continue;
			if(arr[i][indexArray[i]]<min) {
				min=arr[i][indexArray[i]];
				t.i=i;
				t.j=indexArray[i];
			}
		}
		System.out.println(min+" "+t.i+" "+t.j);
		return t;
	}

}
