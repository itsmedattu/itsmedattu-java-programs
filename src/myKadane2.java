

import java.util.ArrayList;
import java.util.Scanner;

public class myKadane2 {

	public static void main(String[] args) {
		int T=0;
		int N;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer[]> Tlist = null;
			T=Integer.parseInt(sc.nextLine());		

			Tlist=new ArrayList<Integer[]>();
			



			for(int i=0;i<T;i++)
			{
				N=0;
				N=sc.nextInt();
				Integer [] temp=new Integer[N];
				for(int j=0;j<N;j++)
				{
					temp[j]=sc.nextInt();
					sc.hasNextLine();
				}			
				Tlist.add(temp);
				temp=null;
				
			}
			
		System.out.println("Output of Online Judge is:");
	for(int i=0;i<Tlist.size();i++)
			System.out.println(findMaxSum(Tlist.get(i)));
		
		sc.close();
			
	}
	
	public static int findMaxSum(Integer[] myarray)
	{
		int tempSum=myarray[0];
		int sum=myarray[0];
		for(int i=1;i<myarray.length;i++)
		{
			if(myarray[i]>=0)
			{
				sum=sum+myarray[i];	
			}
			else {

				if(sum	>= tempSum)
					sum=tempSum;
				else
				sum=myarray[i];
			}
		}
		return sum;
	}

}
