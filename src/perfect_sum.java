
public class perfect_sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("hello boss");
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements");
		System.out.println();
		int numElements=sc.nextInt();
		System.out.println("Please enter array elements");
		System.out.println();
		for(int i=0;i<numElements;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Please enter the number");
		System.out.println();
		int number=sc.nextInt();
		*/
		int numElements=6;
		int[] al={2,3,5,6,8,10};
		int number=10;
		System.out.println("number of elements : "+numElements);
		System.out.println("values of array are");
		for(int i=0;i<al.length;i++)
		{
			System.out.print(al[i]+ " ");
		}
		System.out.println();
		System.out.println("number is : "+number);
		int ps=countPerfectSums(numElements, al, number);
		
	}
	public static int countPerfectSums(int nElements,int [] al,int n)
	{
		System.out.println("array length is "+al.length);
		//System.exit(0);
		int sum=0;
		int count=0;
		for(int i=0;i<al.length;i++)
		{
			sum=0;
			for(int j=i+1;j<al.length&&sum<n;j++)
			{
				sum=sum+al[i]+al[j];
				System.out.println("al[i] is "+al[i]+" al[j] is "+al[j]+" sum is "+sum);
			}
			if(sum==n)
			{
				count++;
				
			}
			
		}
		
		return 999;
	}
	
}
