/*Write a recursive program to print numbers from 1 to N.*/
import java.util.Scanner;

class Print1ToN{
	static void printNumber(int n){
		if(n==1){
			System.out.println(n);
			return;
		}
		
		printNumber(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
			int num;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Num");
			num=scanner.nextInt();
			printNumber(5);

	}
}