package p1;

public class Employee extends Person{
	private double salary;

	public Employee(String name,int age){
		super(name,age);  // super must be first statement in constructor
	}

	public Employee(String name,int age,double salary){
		super(name,age);  // super must be first statement in constructor
		this.salary=salary;
	}

	public double getSalary() { return salary;}
	public void setSalary(double salary){ this.salary=salary;}

	public void showEmployee(){
		System.out.println("NAME     AGE     SALARAY :");
		//super.name 
		//System.out.println(super.getName())
		//System.out.println(super.getAge())
		super.displayInfo();

		System.out.printf("%10.2f",salary);

	}
}