package p1;

import college.stud.Student;
import college.staff.Staff;
import college.person.Person;

class App{
	public static void main(String[] args) {
		
		Student student=new Student("Karan","PUNE","JAVA",2022,47500);
		Staff  staff1=new Staff("Kalpesh","Karve Nagar","VMT",434343);
		Person person=new Person("Kareena","Mumbai");

		System.out.println(student.getProgram());
		System.out.println(staff1.getSchool());
		System.out.println(person.getAddress());


	}
}