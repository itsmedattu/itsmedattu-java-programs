	import java.io.*;
	import java.util.*;

	public class HackerRankProblem {
	    public int no_of_house_sold(int[][] clients , int[][] houses , int n, int m)
	    {
	        int count=0; 
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                if((houses[j][0]>clients[i][0])&&(houses[j][1]<clients[i][1])&&(houses[j][2]==0))
	                {
	                    houses[j][2] = 1 ;
	                    clients[i][2]= 1;
	                    count++;                     
	                }
	            }
	        }
	        return count ; 
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
			int n = in.nextInt();
	        int m = in.nextInt();
	        int clients[][] = new int[n][3];
	        int houses[][] = new int[m][3];
			for (int i = 0; i < n; i++) {
	            for(int j=0;j<2;j++)
	            {
	                clients[i][j] = in.nextInt();
	            }
	            clients[i][2]=0;
	        }
	        for(int i=0;i<m;i++ )
	        {
	            for(int j=0;j<2;j++)
	            {
	                houses[i][j] = in.nextInt();
	            }
	            houses[i][2] = 0 ;
	        }
	        HackerRankProblem s = new HackerRankProblem();
	        int result = s.no_of_house_sold(clients,houses,n,m);
	        System.out.println(result);
	    }
	}