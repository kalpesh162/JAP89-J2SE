
class Student{
	 int rollNo;
	 String name;
	 int age;


	 public void setName(String name){ 
	 	if(name.isEmpty()){
	 		throw new IllegalArgumentException("Name Cant not be empty ");
	 	}

	 	this.name=name;

	 }
	 public void setAge(int age){ 
	 	if(age>3 && age<=100)
	 	this.age=age;
	 	else
	 		throw new InvalidAgeException("Invalid Age :  "+age);

	 }
	 public void setRollNo(int rollNo){ this.rollNo=rollNo;}
}

class InvalidAgeException extends RuntimeException{

	public InvalidAgeException(){ }
	public InvalidAgeException(String desc){ 
     super(desc);
	}

}

public class Example07{
	public static void main(String[] args) {

		Student s1=new Student();
		s1.setName("Rahul");
		try{
		s1.setAge(-11);
	}catch(InvalidAgeException e){
		System.out.println(e.getMessage());
	}
		s1.setRollNo(22);

		System.out.println("END");
		
	}
}