 class App{
	public static void main(String[] args) {
		

		Student student1=new Student();
		//student1.rollNo=11;
		student1.setRollNo(11);
		// student1.name="Ravi";
		student1.setName("Ravi");
		// student1.marks=66.66;
		student1.setMarks(66.66);

		student1.displayStudentInfo();

		System.out.println("------------------");

		System.out.println("Marks  "+student1.getMarks());

		System.out.println("Grade  :   "+student1.grade());


	}
}