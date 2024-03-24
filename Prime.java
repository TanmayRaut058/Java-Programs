class Prime{
	public boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	public int countPrime(int[] nums){
		int count = 0;
		for(int n : nums){
			if(isPrime(n)){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		Prime p = new Prime();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println(p.countPrime(arr));
	}
}
