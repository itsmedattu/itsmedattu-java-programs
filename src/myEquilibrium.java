

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myEquilibrium {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			Object s=new Object();
			int[] myArray=new int[n];
			
			String str=br.readLine();
			
			String[] strArray=str.trim().split("\\s+");
			
			int sum=0;
			
			for(int i=0;i<n;i++) {
				myArray[i]=Integer.parseInt(strArray[i]);
				sum=sum+myArray[i];
			}
			
			System.out.println(findEquilibrium(myArray, n,sum));

		}

		br.close();
	}

	public static int findEquilibrium(int[] myArray, int n,int sum) {
		
		int leftSum=0;
			
			for(int i=0;i<n;++i) {
				sum-=myArray[i];

				if(leftSum==sum)
					return i+1;
							
				leftSum=leftSum+myArray[i];
			}
		 return -1;
	}

}
