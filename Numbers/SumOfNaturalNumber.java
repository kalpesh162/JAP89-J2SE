//Write a Java program to find the sum of all natural numbers between 1 to n.
import java.util.Scanner;
class SumOfNaturalNumber{
	public static void main(String[] args) {
		int start=1;
		int n;
		System.out.println("Enter  N");

		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();

		// 1  2 3 4 5 6 
		int sum=0;
		for(int i=start;i<=n;i++){
			sum=sum+i;
		}
		
		System.out.println(sum);
	}
}