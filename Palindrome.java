class Palindrome{
	
	public boolean isPalindrome(String s){
		int i = 0, j = s.length() - 1;
		while(i <= j){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String args[]){
		Palindrome p = new Palindrome();
		String str = "racecar";
		System.out.println(p.isPalindrome(str));
	}
}
