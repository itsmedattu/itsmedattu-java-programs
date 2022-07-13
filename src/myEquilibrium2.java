

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myEquilibrium2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			
			int[] myArray=new int[n];
			
			String str=br.readLine();
			String[] strArray=str.trim().split("\\s+");
			
			for(int i=0;i<n;i++)
				myArray[i]=Integer.parseInt(strArray[i]);
			
			StringBuffer sb=new StringBuffer();
			sb.append(findEquilibrium(myArray, n));
			
			
			System.out.println(sb);
		}
		
		br.close();
	}

	public static int findEquilibrium(int[] myArray, int n) {
		
		if(n==1)
			return 1;
		
		for(int i=1;i<n;i++)
		{
				int left=i-1;
				int right=i+1;
				int diff=0;
				while(left>=0||right<n) {
					
					if(right==n&&i==n-1) {
						return -1;
					}

					if(left==-1&&right==n)
						break;
					
					if(left==-1) {
						diff=diff+myArray[right];
						right++;
					}
					
					else if(right==n) {
						diff=diff-myArray[left];
						left--;
					}

					else if(left>=0) {
						diff=diff+myArray[right]-myArray[left];
						left--;
						right++;
					}

					
																
				}
				
				if(diff==0)
				{
					return i+1;
				}
				left=0;
				right=0;
		}
	
	
		return -1;
	}

}
