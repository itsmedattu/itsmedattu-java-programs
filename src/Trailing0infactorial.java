

public class Trailing0infactorial {
	
	int findtrailing0(int n)
	{
		int count=0;;
		while(n>0) {
	        count=count+n/5;
	        n/=5;
		}
		System.out.println("count is "+count);
		return count;
	}

}
