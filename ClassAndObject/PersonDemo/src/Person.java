public class Person{
	String name;
	int age;

	Person(String n){ name=n; }

	void printPerson(){
		System.out.print("Name  "+name);
		System.out.print("Age   "+age);
	}

	void growOlder(){
		age=age+1;
	}

	int getAge(){ return age;}

	boolean isOfLegalAge(){
		if(age>18) return true;
		else
		return falsel
	}

	String getName(){ return name;}

}