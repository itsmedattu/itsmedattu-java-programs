

import java.util.HashSet;

public class MaxLengthSubString {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("ababcab");
		//StringBuffer str=new StringBuffer("abcdef");
		String modifiedStr=findMaxLenthSubString(str);
		System.out.println("MaxLength Substring of "+str+" with no duplicate character is "+modifiedStr);
	}

	//good but not optimal . we can do it in O(n) using hashing or by storing visited value
	private static String findMaxLenthSubString(StringBuffer str) {
		int max=0;
		int startIndex=0;
		for(int i=0;i<str.length();i++) {
			HashSet hs=new HashSet();
			for(int j=i;j<str.length();j++) {
				if(!hs.add(str.charAt(j))||(j==str.length()-1))
				{
					if(max<j-i)
					{
						startIndex=i;
						if(j==str.length()-1) 
							max=j-i+1;
						else 
							max=j-i;
					}
					
				//	System.out.println("value is i "+i+" j "+j+" max "+max);
					break;
				}
				
				
			}
		}	
//		System.out.println(" sub string is "+str.substring(startIndex,startIndex+max));
		return str.substring(startIndex,startIndex+max);
	}



}
