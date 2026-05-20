//✔Write a recursive program to count the number of digits in a number.
import java.util.Scanner;
class CountDigit{

	static int countDigit(int n){
		if(n==0)
			return 0;

		return 1+countDigit(n/10);

	}

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int num;
			System.out.println("Enter Num");
			num=scanner.nextInt();

		System.out.println(countDigit(num));
	}
}