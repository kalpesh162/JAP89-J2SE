//Write a Java program to check whether a number is a multiple of 3 but not 7.
import java.util.Scanner;
class MultipleOf{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();

		//divisible by 3  num%3==0
		//not divisible by 7  num%7!=0
		if(num%3==0 && num%7!=0)
			System.out.println("divisible by 3 "+num);
		else
			System.out.println("NOT divisible by 3  only"+num);

		System.out.println("------------------------------");
		if(num%3==0){
			if(num%7!=0){
				System.out.println("divisible by 3 "+num);
			}
			else
				System.out.println("NOT divisible by 3  only"+num);
		}
		else{
			System.out.println("NOT divisible by 3  only"+num);	
		}


	}

}
