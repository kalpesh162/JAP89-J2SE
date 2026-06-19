package p1;

public class Person{
	private String name;
	private int age;

	public Person(){
		name="";
		age=0;
	}
	public Person(String name,int age){
		this.name=name;
		if(age>0)
		this.age=age;

	}

	public Person(String name){
		this.name=name;
	}

	public void setAge(int age){
		if(age>0)
		this.age=age;
		else
			System.out.println("Enter Age Positive");
	}
	public void setName(String name) { this.name=name;}

	public int getAge(){ return age;}
	public String getName() { return name;}

	// Logics
	public void displayInfo(){
		//System.out.println("Name      Age");
		System.out.printf("%5s   %d ",name,age);
		
	}

}