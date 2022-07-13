

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class mySpecialSort14 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
		
			int [] myArray=new int[N];

			String str=br.readLine();
			String[] strArray=str.trim().split("\\s+");
			
			for(int j=0;j<N;j++) {
				myArray[j]=Integer.parseInt(strArray[j]);
			}
			
			mysort(myArray,N);

			StringBuffer sb=new StringBuffer();
			for(int k=0;k<N;k++) {
				sb.append(myArray[k]);
			}
			
			System.out.println(sb);
		}
		br.close();
	}
	public static void mysort(int[] myArray,int N)
	{
		int low=0,mid=0,pivot=1,end=N-1;
		while(mid<=end)
		{
			if(myArray[mid]<pivot)
			{
				int mytemp=myArray[low];
				myArray[low]=myArray[mid];
				myArray[mid]=mytemp;
				low++;
				mid++;
			}
			else if(myArray[mid]>pivot) {
				 int mytemp=myArray[mid];
				myArray[mid]=myArray[end];
				myArray[end]=mytemp;
				end--;
			}
			else
				mid++;
			
		} 

	}

}
