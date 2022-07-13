
import java.util.LinkedList;
import java.util.Queue;

public class complementOfBase10 {

	public static void main(String[] args) {
		complementOfBase10 obj=new complementOfBase10();
		int no=5;
		int com=obj.getComplement(no);
		System.out.println(com);
		no=10;
		com=obj.getComplement(no);
		System.out.println(com);
		no=7;
		com=obj.getComplement(no);
		System.out.println(com);

	}

	private int getComplement(int num) {
		int no=0,index=0;
		while(num!=0) {
			no=(int) (no+(Math.pow(2, index))*(num%2==1?0:1));
			num=num/2;
			index++;
		}
		return no;
	}



}
