
//✔Write a recursive program to find the product of digits of a number.
import java.util.Scanner;
class ProductDigits{
	
		static int productDigit(int n){
		if(n<=9)
			return n;

		return n%10*productDigit(n/10);

	}

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int num;
			System.out.println("Enter Num");
			num=scanner.nextInt();

		System.out.println(productDigit(num));
	}
	
}