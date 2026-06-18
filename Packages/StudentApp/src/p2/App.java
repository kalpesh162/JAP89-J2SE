package p2;

import static p1.Student.getInstitute;

import p1.Student; //  cannot find symbol

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class App{
	public static void main(String[] args) {

		// fully classfied Name
		p1.Student stud=new p1.Student();

		Student student=new Student(11,"Kalpesh",44.44445);

		student.printStudent();

		System.out.println();
		// private 
		//System.out.println("Name Of Institution  "+student.institute);
		System.out.println("Name Of Institution  "+student.getInstitute());
		
		// className.staticmethod	
		System.out.println("Name Of Institution  "+Student.getInstitute());

		System.out.println("----------------");
		System.out.println("Name Of Institution  "+getInstitute());

		// fully Classfied Name
		System.out.println(java.lang.Math.PI);		
		System.out.println("----------------");
		
		System.out.println(PI);		

		System.out.println(pow(3,3));		

		
	}
}

/*
public class java.lang.Math{

	public final static double PI=3.14;

}

Whats diff between static import and import

*/

