class SubString{

	public void subString(String s){
		for(int i = 0; i < s.length(); i++){
			for(int j = i; j  < s.length(); j++){
				System.out.println(s.substring(i , j+1));
			}
		}
	}

	public static void main(String[] args){
		SubString s = new SubString();
		String str = "Tanmay";
		s.subString(str);
	}
}
