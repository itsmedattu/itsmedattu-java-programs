

public class MultipleInheritanceJava {

	public static void main(String[] args) {

	third t=new third();
	System.out.println("sum is "+t.add(2,3));
	first f=new third();
	System.out.println("sum is "+f.add(4,3));
	first s=new third();
	System.out.println("sum is "+s.add(4,10));


	}

}


interface first 
{
	int add(int x,int y);
}
interface second
{
	int add(int x,int y);
}

class third implements first,second
{
	public int add(int a,int b) {
		return a+b;
	}
	
}
