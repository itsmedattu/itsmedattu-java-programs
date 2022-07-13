


import java.util.*; 

public class FindIntersection {
	void print(int[] array) {
		for(int i:array) 
			System.out.print(i+" ");		
	}
	public static void main(String[] args) {
		int []Array1= {1,1,5,5,6,8};
		int []Array2= {1,3,5,5,6,8,9};
		FindIntersection obj=new FindIntersection();
		int [] intersection=obj.intersecctionnew(Array1, Array2);
		obj.print(intersection);
		
		int[] a1= {2,3,1,1,1,1,1,5,7,3,3};
		int[] a2= {4,2,6,7,8,2,3,3,3,8,4,1,1,1,1,1};
		intersection=obj.intersecctionnew(a1, a2);
		System.out.println();
		obj.print(intersection);
	}

		int[] intersecction (int[] Left,int[] Right )
		{
			int k=-0,count=0;
			int [] Result=new int[Math.min(Left.length, Right.length)];
			for(int i=0;i<Left.length;i++) {
				for(int j=0;j<Right.length;j++) {
					if(Left[i]==Right[j]) {
						Result[k++]=Left[i];
						Right[j]=-1;
						count++;
						break;
					}
				}
			}
			return Arrays.copyOfRange(Result, 0, k);
			
		
		}
		int[] intersect (int[] Left,int[] Right )
		{
			TreeSet<Integer> leftSet=new TreeSet<Integer>();
			int k=0,count=0;
			for(int leftIndex:Left)
				leftSet.add(leftIndex);
			int[] indexcounts=new int[leftSet.size()];

			Iterator<Integer> itr=leftSet.iterator();
			while(itr.hasNext()) {
				int temp=itr.next();
				System.out.println("hi");
			for(int j=0;j<Right.length;j++) {
					if(temp==Right[j]) {
						System.out.println("hello");
						indexcounts[k++]++;
						Right[j]=-1;
						count++;
						break;
					}
				}
			}
			int[] Result=new int[count];
			for(int x:indexcounts) {
				
				System.out.println(x);
			}
		return null;
		}
		int[] intersecctionnew (int[] Left,int[] Right )
		{
		    int tempIndex=-1;
			List<Integer> intersection=new LinkedList<Integer>();
			List<Integer> rightList=new LinkedList<Integer>();
			for(int x:Right)
				rightList.add(x);
			//Collections.sort(rightList); --- edit
			for(int value:Left) {
				tempIndex=binarySearch(rightList, value);
			  if(tempIndex!=-1) {
				  rightList.remove(tempIndex);
				  intersection.add(value);
			  }
			}
			int[] Result=new int[intersection.size()];
			int i=0;
			while(i<intersection.size()) {
				Result[i]=intersection.get(i);
				i++;
			}
			return Result;	
		}
	
	
		    int binarySearch(List<Integer> list, int x) 
		    { 
		        int l = 0, r = list.size() - 1; 
		        while (l <= r) { 
		            int m = l + (r - l) / 2; 
		  
		  
		            if (list.get(m)== x) {
		            	return m; 
		               
		            }
		  
		   
		            if (list.get(m) < x) 
		                l = m + 1; 
		
		            else
		                r = m - 1; 
		        } 
		  
		        // if we reach here, then element was 
		        // not present 
		        return -1; 
		    } 
}