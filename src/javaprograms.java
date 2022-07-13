
public class javaprograms {

	public static void main(String[] args) {
		RemoveAdjacent ra=new RemoveAdjacent();
		String str="bappay";
		char[] strArray=str.toCharArray();
		System.out.println(ra.removeAdj(strArray,strArray.length));
		System.out.println("hello");
	}

}
