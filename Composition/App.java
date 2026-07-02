class Address{
	private String city;
	private int pincode;
	Address(){}
	Address(String city,int pincode){
		this.city=city;
		this.pincode=pincode;
	}
	// setter
	// getter

	// Business Logic
	@Override
	public String toString(){
		return "  city "+city+"  "+pincode+" ";
	}
}

class Employee{
	private int id;
	private String name;
	private double salary;

	// has-a
	private Address address;

	Employee(){}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	Employee(int id,String name,double salary,Address address){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;	
	}

	Employee(Address address){
		 this.address=address;
	}

	// setter
	// getter

	void setAddress(Address address){ this.address=address;}
	Address getAddress(){ return address;}

	@Override
	public String toString(){
		return "id "+id +"  name : "+name+"  salary :"+salary+"  "+this.address.toString();
	}

}

class App{
	public static void main(String[] args) {

		Employee emp1=new Employee(11,"Rahul",53533);
		Address add1=new Address("PUNE",444222);

		emp1.setAddress(add1);  // Setter

		Address add2=new Address("MUMBAI",54545);
		// Constructor
		Employee emp2=new Employee(22,"Sachin",43534,add2);

		System.out.println(emp1);
		System.out.println(emp2);

        // print(Object o) { o.toString()}
   		// emp.toString()
   		//public String toString(){
		//return "id "+this.id +"  name : "+this.name+"  salary :"+this.salary+"  "+this.address ;  -->this.address.toString()
	}

		
	}
