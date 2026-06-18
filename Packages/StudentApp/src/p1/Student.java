package p1;
public class Student{
	private int id;
	private String name;
	private double marks;
	private static String institute;

	static{
		institute="Vibrant Minds";
	}

	public Student(){}
	public Student(int id,String name,double marks){
		 this.id=id; this.name=name; this.marks=marks;
	}

	// getter

	// setters

	// instance Function
	public static String getInstitute(){
		return institute;
	}

	public void printStudent(){
		System.out.printf("%3s %7s %6s","ID","NAME","MARKS");
		System.out.println();

		System.out.printf("%3d ",id);
		System.out.printf("%7s",name);
		System.out.printf("%4.2f",marks);

	}
}

/*
//In single .java file we can write multiple classes
 class A{

}
class B{

}
*/

/*
//In single .java file we can write multiple classes
public class A{

}
class B{

}

Note i single .java file we can write multiple classes but only one public class

*/