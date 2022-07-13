

public class findLowestPossibleNumber {
	static StringBuffer minValue	=new StringBuffer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("991");
		int n=2;
		String LowestPossibleNumber=GenerateLowestNumber(str,n);
		System.out.println("Lowest Possible number is "+LowestPossibleNumber);
	}
	
	public static String GenerateLowestNumber(String number, int n) 
	{
		int minIndex=0;
		
		if(n==0) {
			return minValue.append(number).toString();
		}

		else if(number.length()<=n)
			return minValue.append("").toString();
		
		for(int j=1;j<=n;j++) {
				if(number.charAt(j)<number.charAt(minIndex))
				{
					minIndex=j;
				}		
		}
		
		minValue.append(number.charAt(minIndex));
		number=number.substring(minIndex+1);
			
		return GenerateLowestNumber(number, n-minIndex);
	}
	

}
