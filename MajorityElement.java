class MajorityElement{
	public int majorityElement(int nums[]){
		int max = -1;
		for(int i = 0; i < nums.length; i++){
			int count = 0;
			for(int j = 0; j < nums.length; j++){
				if(nums[j] == nums[i]){
					count++;
				}
			}
			max = Math.max(max , count);
		}
		return max;
	}
	
	
	public static void main(String [] args) {
	        MajorityElement m = new MajorityElement();
	        int arr[] = {1,4,3,8,5,2,7,99,1,2,4,5,4,5,6,2,5,4,2,3,6,7,8,5,4,3,5,9,6};
	        System.out.println(m.majorityElement(arr));
	}
}
