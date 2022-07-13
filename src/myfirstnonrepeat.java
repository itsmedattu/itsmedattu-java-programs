/**
 * 
 */

/**
 * @author Dattatreya
 *
 */
import java.io.*;

public class myfirstnonrepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=null;
		s+=10;
		System.out.println(s);
		char ch='0';
		ch/=0.9;
		System.out.println(ch);
		System.exit(0);
		// TODO Auto-generated method stub
		BomberAlgo b=new BomberAlgo();
	
		//b.Bomber("aabcccdee");
		CopyOfBomberAlgonew cp=new CopyOfBomberAlgonew();
		StringBuilder str=new StringBuilder("abcccdee");
		cp.Bomber(str);
		

		System.out.println();
		System.out.println();
		
		StringBuilder str1=new StringBuilder("abcdeedcbfgf");
		cp.Bomber(str1);
		System.out.println();
		System.out.println();
		
		StringBuilder str2=new StringBuilder("abbabba");
		cp.Bomber(str2);
//		cp.Bomber("abdee");
	
		//b.Bomber("aabcd");
		System.out.println("END");
		/*
	//	String s=new String("dattu");
		System.out.print("DATTU");
		char ch=firstnonrepeat("dattu".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("ddptu".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("ddpupt".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("dadadat".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("ddddddddd".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("dddddddddk".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("racecar".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		
		
		

		
		ch=firstnonrepeat("prasanth".toCharArray());
		System.out.println("non repeated one is "+ch);
		
		ch=firstnonrepeat("dadadada".toCharArray());
		System.out.println("non repeated one is "+ch);
		
	//	System.out.println("non repeated one is "+ch);
		System.out.println("Here I am back with more power");
		*/
	}
    static char firstnonrepeat(char str[]){
    	int count=0;
        char []tstr=str;
    	
    	for(int i=0;i<str.length;i++){    
    		count=0;
		for(int j=i+1;j<str.length;j++){	
			if(str[i]==str[j]){	 
					  char temp=tstr[i+1];
        			  tstr[i+1]=tstr[j];
        			  tstr[j]=temp;
        			  count++;
        		  }
        		  else 
        			  continue;
    	}
		if(count==0){
			if(i==0)
			{
				return tstr[i] ;
			}
			else if(tstr[i]!=tstr[i-1])
			 return tstr[i];
		}
		
		}
 		return '0';
	}
}


