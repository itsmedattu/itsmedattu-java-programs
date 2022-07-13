

public class GetMissingNumber {

	public static void main(String[] args) {
		int[] numbers= {2,1,3,5,7,5,6};
		Integer[] numbers1= {2,1,3,5,7,5,6};
		
		GetMissingNumber mo=new GetMissingNumber();
		System.out.println(numbers+" missing numer is "+mo.getMissingNumber(numbers));
		System.out.println(numbers1+" missing numer is "+mo.getMissingNumber(numbers1));
		System.exit(0);
		for(int i=5;i>=1;--i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	int getMissingNumber(int[] numbers)
	{
		int[] nums=new int[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			nums[numbers[i]-1]=numbers[i];
		}
		for(int j=0;j<nums.length;j++) {
		   if(j+1!=nums[j])
				return j+1;
		}
		return -1;
	}
	
	int getMissingNumber(Integer[] numbers)
	{
		Integer[] nums=new Integer[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			nums[numbers[i]-1]=numbers[i];
		}
		for(int j=0;j<nums.length;j++) {
		   if(nums[j]==null)
				return j+1;
		}
		return -1;
	}
	
}
