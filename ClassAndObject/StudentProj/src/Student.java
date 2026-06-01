 class Student{
	//public int rollNo;
	//private int rollNo;
	//protected int rollNo;
	// default  ~
	int rollNo;
	String name;
	double marks;

	void displayStudentInfo(){
		System.out.println("ID  : "+rollNo);
		System.out.println("Name  : "+name);
		System.out.println("Marks  : "+marks);
	}

	int getRollNo(){return rollNo;}
	String getName(){ return name; }
	double getMarks()  { return marks;}

	void setRollNo(int no){
		 rollNo=no;
	}
	void setName(String n){
		name=n;
	}
	void setMarks(double m){
		marks=m;
	}
	String grade(){
		if(marks>=90) return "A+";
		else if(marks>=80 && marks<90) return "A";
		else if(marks>=70 && marks<80) return "B";
		else if(marks>=60 && marks<70) return "C";
		else if(marks>=50 && marks<60) return "D";
		else  return "E";
	}

}