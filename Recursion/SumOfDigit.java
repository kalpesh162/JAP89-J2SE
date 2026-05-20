//Write a recursive program to calculate the sum of digits of a number.
import java.util.Scanner;
class SumOfDigit{

	static int sumOfDigit(int num){

		if(num==0) return 0;
		return num%10 + sumOfDigit(num/10);

	}

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int num;
			System.out.println("Enter Num");
			num=scanner.nextInt();

			System.out.println(sumOfDigit(num));
		
	}
}