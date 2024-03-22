import java.util.*;
class binarySearch{
	public int binary(int[] arr, int target){
		Arrays.sort(arr);
		int l = 0, r = arr.length - 1;
		while(l <= r){
			int mid  = l + (r - l)/2;
			if(arr[mid] == target){
				return mid;
			}
			if(arr[mid] < target){
				l = mid + 1; 
			} else {
				r = mid - 1;
			}
 		}
 		return -1;
	}
	public static void main(String args[]){
		binarySearch b = new binarySearch();
		int nums[] = {4,6,8,4,2,2,1,4,6,88,47,53,12,0,48,6,4,7,555,41,11,23,59,100};
		int val = b.binary(nums , 47);
		if(val != -1){
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
 }
