
public class findSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {10,5,2,6};
		int n=100;
		findSubArray fsb=new findSubArray();
		int count=fsb.printAllSubArrays(array,n);
		System.out.println("number of subArrays "+count);
	}

	int printAllSubArrays(int[] array,int n) {
        int count=0;
        //printSubArrays(array,1,3);\
        int itr=1;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i;j++) {
			int mul=array[i]*array[i+1];
			
			if(mul<n)
			{
				count=count+printSubArrays(array, i,itr);
				
			}
			array[i]=mul;
			itr++;
			}
//			printSubArrays(array,0,array.length);
//			printSubArrays(array[i],i);
		}
		return count;
	}
	
	int printSubArrays(int []arr,int start,int it)
	{
		int count=0;
		for(int i=start;i<=it&&i<arr.length;i++) {
			System.out.println();
			for(int j=start;j<=i&&j<arr.length;j++) {
			 	
			   
				System.out.print(arr[j]+" ");
			}
			 count++;
		}
		return count;
	}

}
