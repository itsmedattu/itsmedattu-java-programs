

public class findLowestPossibleNumber2 {
	//static StringBuffer minValue	=new StringBuffer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub		

	//	System.out.println("Lowest Possible number for str is " +GenerateLowestNumber("4205123",4));
	//	System.out.println("Lowest Possible number for str is " +GenerateLowestNumber("216504",3));
	//	System.out.println("Lowest Possible number for str is " +GenerateLowestNumber("991",2));
		System.out.println("Lowest Possible number for str is " +GenerateLowestNumber("765028321",5));		
	//	System.out.println("Lowest Possible number for str is " +GenerateLowestNumber("1000454",5));

	}
	
	public static String GenerateLowestNumber(String number, int n) 
	{
		int minIndex=0;
		StringBuffer minValue=new StringBuffer();
		while(n>=0) {
			System.out.println(" n is "+n);
			System.out.println("minIndex "+minIndex);
			System.out.println("min value is "+minValue);
			System.out.println();
			if(n==0)
			{
				minValue.append(number);
				return minValue.toString();
			}
			else if(number.length()<=n) {
				break;
			}
			for(int j=1;j<=n;j++) {
				if(number.charAt(j)<number.charAt(minIndex))
				{
					minIndex=j;
					System.out.println(" j is "+j+"minIndex is "+minIndex);
				}		
			}
			minValue.append(number.charAt(minIndex));
			number=number.substring(minIndex+1);
			n=n-minIndex;
			minIndex=0;		
		}
		
		return minValue.toString();
	}
	

}
