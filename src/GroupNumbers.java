

public class GroupNumbers {

	void print(int []a) {
		for(int i:a)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		int[] ar= {2,3,5,7,6,8,1,3};
		GroupNumbers gn=new GroupNumbers();
		gn.print(ar);
		gn.groupNumbersnew(ar);
		System.out.println();
		gn.print(ar);

	}
	int [] groupNumbers(int[] ar) 
	{
		int start=0,end=ar.length-1,temp;	
		while(start<=end) {
			if(ar[start]%2==1) {
				temp=ar[start];
				ar[start]=ar[end];
				ar[end]=temp;
				end--;
			}
			else
				start++;
		}
		return ar;
	}
	int [] groupNumbersnew(int[] ar) 
	{
		int oddIndex=0,temp;	
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				if(oddIndex!=i) {
				temp=ar[oddIndex];
				ar[oddIndex]=ar[i];
				ar[i]=temp;
				}
				oddIndex++;
			}
		}
			return ar;
	}


}
