/*
Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%
    */
    import java.util.Scanner;
class  EmployeeSalary{
	public static void main(String[] args) {
		double basicSalary;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter BASIC Salary....");
		basicSalary=scanner.nextDouble();
		double grossSalary=0;
		double hra=0;
		double da=0;


		if(basicSalary<=10000){
			hra=basicSalary*0.2; da=basicSalary*0.8;
			grossSalary=basicSalary+hra + da;
		}
		else if(basicSalary>10000 && basicSalary<=20000){
			hra=basicSalary*0.25; da=basicSalary*0.9;
			grossSalary=basicSalary+hra + da;
		}
		else if(basicSalary>20000){
			hra=basicSalary*0.3; da=basicSalary*0.95;
			grossSalary=basicSalary+hra + da;
		}

		System.out.println("grossSalary  "+grossSalary);

		System.out.println("-----------------SALARY CALCULATOR---------------------");
		System.out.println("BASIC SALARY        "+basicSalary);
		System.out.println("HRA		     "+hra);
		System.out.println("DA                  "+da);
		System.out.println("-----------------------------------------");
		System.out.println("Gross SALARY        "+grossSalary);
		System.out.println("--------------------------------------");



	}
}
