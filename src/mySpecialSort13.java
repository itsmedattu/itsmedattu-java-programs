

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mySpecialSort13 {

	public static void main(String[] args) throws Exception {
		
		int N=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		
		int T=Integer.parseInt(br.readLine());
		if(T<=0)
		{
			System.out.println("wrong input");
			System.exit(0);
		}
		
		for(int i=0;i<T;i++)
		{
			N=Integer.parseInt(br.readLine());
			int [] myArray=new int[N];

			if(N<=0)
			{
				System.exit(0);
			}
			String[] temp=br.readLine().split("\\s+");
			
			for(int j=0;j<temp.length;j++) {
					myArray[j]=Integer.parseInt(temp[j]);
			}
			
			int low=0,mid=0,pivot=1,end=myArray.length-1;
			while(mid<=end)
			{
				System.out.println("low mid end "+low +" "+mid+" "+end);
				if(myArray[mid]<pivot)
				{
					swap(myArray,low,mid);
					low++;
					mid++;
				}
				else if(myArray[mid]>pivot) {
					swap(myArray,mid,end);
					end--;
				}
				else
					mid++;
				
			}
			for(int k:myArray) {
				System.out.print(k+" ");
			}
			System.out.print("\n");
			N=0;
			myArray=null;
		}
	}

	private static void swap(int[] myArray, int i, int j) {
		// TODO Auto-generated method stub
		int temp=myArray[i];
		myArray[i]=myArray[j];
		myArray[j]=temp;
	}

}
