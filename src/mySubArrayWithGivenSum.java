

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mySubArrayWithGivenSum {

	public static void main(String[] args) throws Exception {
		int T=0;
		int N=0;
		int S=0;
//		System.out.println("Please enter number of elements of the array in first line, array values in second line, sum value in third line");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		T=Integer.parseInt(br.readLine());
		}catch(NumberFormatException ex)
		{
			System.out.println("wrong input");
			System.exit(0);
		}
		if(T<=0)
		{
			System.out.println("wrong input");
			System.exit(0);
		}
		
		for(int i=0;i<T;i++)
		{
			try {
				String [] str=br.readLine().split("\\s+");
				//System.out.println("split values are "+str[0]+ " "+str[1]);
				N=Integer.parseInt(str[0]);
				S=Integer.parseInt(str[1]);
			}catch(NumberFormatException ex) {
				System.out.println("wrong input ");
				System.exit(0);
			}
			if(N<=0)
			{
				System.out.println("wrong input");
				System.exit(0);
			}
			int [] myArray=new int[N];
			for(int j=0;j<N;j++) {
				String [] temp=br.readLine().split("\\s+");
			//	System.out.println("values areee");
				for(int k=0;k<temp.length;k++)
				{
					try {
						//System.out.print(temp[k]+" x");
						myArray[k]=Integer.parseInt(temp[k]);
					}
					catch(NumberFormatException ex)
					{
						break;
					}
						
				}
				int [] res=findSubArraywithGivenSum(myArray,S);
				if(res!=null)
				System.out.println(res[0]+" "+res[1]);
				else 
					System.out.println("-1");
				temp=null;
				N=0;
				S=0;
			}
		}
	}

	private static int[] findSubArraywithGivenSum(int[] myArray, int S) {
		// TODO Auto-generated method stub
/*		System.out.println("\nS is "+S);
		System.out.println(" values are\n");
		for(int i:myArray)
		{
			System.out.print(i+" ");
		}
		
*/
		int sum=0;
		int[] res=new int[2];
		for(int i=0;i<myArray.length;i++)
		{
			res[0]=i+1;
			sum=0;
			for(int j=i;j<myArray.length&&sum<=S;j++)
			{
				sum=sum+myArray[j];
				if(sum==S) {
					res[1]=j+1;
					return res;
				}			
			}
		}
		return null;
	}
}
