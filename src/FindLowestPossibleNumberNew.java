



public class FindLowestPossibleNumberNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] prodCodes= {
				"Product1",
				"DProduct2",
				"Procuct3",
				"RProcuct4",
				"DProduct5"
				};
		
		System.out.println("Before sorting");
		for(String product:prodCodes)
		{
			System.out.print(product+" ");
		}
		OrderProductsByPriority(prodCodes);
		System.out.println("\nAfter sorting ");
		for(String product:prodCodes)
		{
			System.out.print(product+" ");
		}
	}
	
	public static void OrderProductsByPriority(String[] productCodes)
	{
		int high=productCodes.length-1;
		int low=0,medium=0;
		int temp=2;
		
		while(medium<=high)
		{
			
			if(GetPriority(productCodes[medium]) <  temp)
			{
				swap(productCodes, low, medium);
				low++;
				medium++;
			}
			
			else if(GetPriority(productCodes[medium])> temp)
			{
				swap(productCodes,medium,high);
				high--;
			}
			else
			{
				medium++;
			}
			
		}
			
	}
	
	private static int GetPriority(String productCode) {
		if(productCode.startsWith("D"))
		{
			return 1;
		}
		else if(productCode.startsWith("P"))
		{
			return 2;
		}
		else if(productCode.startsWith("R"))
		{
			return 3;
		}
		else 
			return -1;
	}
	public static void swap(String[] productCodes,int i,int j)
	{
		String temp=productCodes[i];
		productCodes[i]=productCodes[j];
		productCodes[j]=temp;
	}

}
