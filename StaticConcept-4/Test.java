class Student{
	int id;
	String name;
	static String institute="---";
	
// to intialize static member
	static{
		System.out.println("Static Block");
		System.out.println("printing   "+institute);
		institute="ABC";
		System.out.println("printing   "+institute);
	}
	Student(int id,String name){
		System.out.println("Constructor Called");
		this.id=id;
		this.name=name;
	}
	public  static void setInstitute(String institute){
		Student.institute=institute;
	}
}
class Test{

	static{
		System.out.println("Static Block Test ");
	}
	public static void main(String[] args) {
		Student s1=new Student(111,"Kalpesh");

	}
}