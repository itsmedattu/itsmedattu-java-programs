

public class MegeSortedArrays {

	public static void main(String[] args) {
		int []arr1= {-1,0,0,3,3,3,0,0,0};
		int []arr2= {1,2,2};
		int []arr=mergeSorted(arr1,arr2);
		MegeSortedArrays obj=new MegeSortedArrays();
		obj.merge(arr1, 6, arr2, 3);
	}

	private static int[] mergeSorted(int[] arr1, int[] arr2) {
		int []arr3=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]==arr2[j])
			{
				arr3[k++]=arr1[i++];
				arr3[k++]=arr2[j++];
			}
			else if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}
			else 
				arr3[k++]=arr2[j++];
		}
		while(i<arr1.length)
			arr3[k++]=arr1[i++];
		while(j<arr2.length) {
			arr3[k++]=arr2[j++];
		}
		return arr3;
	}
	 
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []arr3=new int[m+n];
 		int i=0,j=0,k=0;
 		while(i<m&&j<n) {
 			if(nums1[i]==nums2[j])
 			{
 				arr3[k++]=nums1[i++];
 				arr3[k++]=nums2[j++];
 			}
 			else if(nums1[i]<nums2[j]) {
 				arr3[k++]=nums1[i++];
 			}
 			else {
 				arr3[k++]=nums2[j++];
 			}
 		}

 		while(i<nums1.length&&i<m){
 			arr3[k++]=nums1[i];
 			i++;
 		}
 		while(j<nums2.length&&j<n){
 			arr3[k++]=nums2[j];
 			j++;
 		}
 		int x=0;
 		for(;x<m+n;x++){
 			nums1[x]=arr3[x];
 		}
     }
	  
}
