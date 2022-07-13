

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println("Hola");
		System.out.println("hello");
	 int []array= {1,2,3,4,4,4,4,6};
	 int []array1= {1,1,1,1};
	 RemoveDuplicates rd=new RemoveDuplicates();
	 System.out.println(rd.removeDuplicates(array));
	 System.out.println(rd.removeDuplicates(array1));
	 for(int i:array1)
		 System.out.print(i);

	}
	
	int removeDuplicates(int []array) {
		int count=0,index=0;
		for(int i=0;i<array.length;i++) {
			while(i<array.length-1&&array[i]==array[i+1])
				i++;
			
			if(i==array.length) 
				break;
			array[index]=array[i];
			count++;
			index++;
			
		}

		return count;
	}

}
