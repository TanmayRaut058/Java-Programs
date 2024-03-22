class linearSearch{
	public int linear(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		linearSearch l = new linearSearch();
		int nums[] = {4,6,8,4,2,2,1,4,6,88,47,53,12,0,48,6,4,7,555,41,11,23,59,100};
		int val = l.linear(nums , 47);
		if(val != -1){
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
