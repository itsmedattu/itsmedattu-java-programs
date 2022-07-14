import java.util.Arrays;
import java.util.HashMap;

public class CountPairswithgivenSum {
	public static void main(String args[])
	{
		int[] array= {1,5,7,-1};
		int sum=6;
		CountPairswithgivenSum cp=new CountPairswithgivenSum();
		cp.Display(array);
		System.out.println("sum "+sum+" count: "+cp.getCountPairswithgivensumwithMap(array, sum));
		array= new int[]{1,1,1,1};
		sum=2;
		cp.Display(array);
		System.out.println("sum "+sum+" count: "+cp.getCountPairswithgivenSum(array, sum));
		cp.Display(array);
		System.out.println("sum "+sum+" count: "+cp.getCountPairswithgivenSumwithsort(array, sum));
		cp.Display(array);
		System.out.println("sum "+sum+" count: "+cp.getCountPairswithgivensumwithMap(array, sum));

	}
	int getCountPairswithgivenSum(int[] array,int sum)
	{
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==sum)
				{
					count++;
				}
			}
		}
		return count;
	}

	int getCountPairswithgivenSumwithsort(int[] array,int sum)
	{
		int count=0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]>sum) {
					break;
				}
				if(array[i]+array[j]==sum)
				{
					count++;
				}
			}
		}
		return count;
	}

	int getCountPairswithgivensumwithMap(int[] array,int sum)
	{
		HashMap<Integer,Integer> hp=new HashMap<>();

		int count=0;

		for(int i=0;i<array.length;i++) {
			if(hp.containsKey(sum-array[i])) {
				count=count+hp.get(sum-array[i]);
			}
			if(hp.containsKey(array[i])) {
				hp.put(array[i], hp.get(array[i])+1);
			}
			else {
				hp.put(array[i], 1);
			}
		}
		return count;
	}


	void Display(int[] array) {
		for(int a:array)
		{
			System.out.print(a+" ");
		}
	}
}
