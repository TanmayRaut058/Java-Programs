import java.util.*;
class twoArray{

	//Unsorted
	public int[] mergeTwoArray(int num1[] , int num2[]){
		int n1 = num1.length , n2 = num2.length;
		int n = n1 + n2;
		int arr[] = new int[n];
		for(int i = 0; i < n1; i++){
			arr[i] = num1[i];
		}
		for(int i = 0; i < n2; i++){
			arr[n1 + i] = num2[i];
		}
		return arr;
	}
	
	//Sorted
	public int[] sortMergeArray(int num1[] , int num2[]){
		Arrays.sort(num1);
		Arrays.sort(num2);
		int n1 = num1.length , n2 = num2.length;
		int n = n1 + n2;
		int arr[] = new int[n];
		int i = 0, j = 0, k = 0;
		while(i < n1 && j < n2){
			if(num1[i] < num2[j]){
				arr[k] = num1[i];
				k++;
				i++;
			}
			else {
				arr[k] = num2[j];
				k++;
				j++;
			}
		}
		if(i < n1){
			while(i < n1){
				arr[k++] = num1[i++];
			}
		}
		else {
			while(j < n2){
				arr[k++] = num1[j++];
			}
		}
		
		return arr;
	}
	
	
	public static void main(String args[]){
		twoArray m = new twoArray();
		int num1[] = {1,20,3,40,5,80,7};
		int num2[] = {10,12,14,36,87,100};
		int ans[] = m.sortMergeArray(num1 , num2);
		for(int n : ans){
			System.out.print(n + " ");
		}
	}
}
