//Write a Java program to find the first and last digit of any number.
import java.util.Scanner;
class FirstAndLast{
	public static void main(String[] args) {
		int num;  // 1234
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();

		int last=num%10;  //4

		while(num>9){
			num=num/10;
		}
		int first=num;
		System.out.println(first +" "+last);
		System.out.println(first+last);
	}
}