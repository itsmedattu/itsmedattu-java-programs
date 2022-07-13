

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myMissingNumberArray {
	public static void main(String[] args) throws Exception {

		int T=0;
		int N=0;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++)
		{
			N=Integer.parseInt(br.readLine());
			int [] myArray=new int[N+1];
			for(int j=0;j<N-1;j++) {
				String [] temp=br.readLine().split("\\s+");
				
				for(int k=0;k<temp.length;k++)
				{
					myArray[Integer.parseInt(temp[k])-1]=1;
				}
				System.out.println(findmissingNumberinArray(myArray, N));
				temp=null;
				N=0;
			}
		}
	}

	public static int findmissingNumberinArray(int [] myarray,int N)
	{
		for(int i=0;i<N;i++)
		{
			if(myarray[i]!=1)
			{
				return i+1;
			}
		}
		return N;
	}
	
}


