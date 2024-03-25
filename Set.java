import java.util.*;

class Set{
	public void unionOfArrays(int[] nums1 , int[] nums2){
		int n1 = nums1.length , n2 = nums2.length;
		int res[] = new int[n1 + n2];
		int k = 0;
		
		for(int i = 0; i < n1; i++){
			res[k++] = nums1[i];
		}
		
		
		for(int i = 0; i < n2; i++){
			boolean isDuplicate = false;
			for(int j = 0; j <= k; j++){
				if(nums2[i] == res[j]){
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate){
				res[k++] = nums2[i];
			}
		}
		
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " " );
		}
	}
	
	public ArrayList<Integer> intersectionOfArrays(int[] nums1, int[] nums2){
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for(int n1 : nums1){
			list.add(n1);
		}
		for(int n2 : nums2){
			if(list.contains(n2)){
				ans.add(n2);
			}
		}
		return ans;
	}
	
	public static void main(String args[]){
		Set s = new Set();
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		s.unionOfArrays(arr1 , arr2);
		System.out.println();
		System.out.println(s.intersectionOfArrays(arr1, arr2));
	}
}
