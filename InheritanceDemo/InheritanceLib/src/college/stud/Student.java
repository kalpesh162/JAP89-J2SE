package college.stud;

import college.person.Person;

public class Student extends Person{
	private String program;
	private int year;
	private double fees;

	public Student(String name,String address,String program,int year,double fees){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fees=fees;
	}

	public void setProgram(String program){ this.program=program;}
	public void setYear(int year){ this.year=year;}
	public void setFees(double fees){ this.fees=fees;}

	public String getProgram(){ return program;}
	public int getYear(){ return year;}
	public double getFees(){ return fees;}

}