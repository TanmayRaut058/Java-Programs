class Person{
	
	String name;
	int age;
		
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public static void main(String[] args){
		Person p1 = new Person("Tanmay" , 20);
		Person p2 = new Person("Gaurav" , 24);
		
		System.out.println("Person 1 Name : " + p1.getName() + " Age : " + p1.getAge());
		System.out.println("Person 1 Name : " + p2.getName() + " Age : " + p2.getAge());
	}
}
