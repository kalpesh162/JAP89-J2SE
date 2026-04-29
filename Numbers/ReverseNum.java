//Write a Java program to enter any number and print its reverse.
import java.util.Scanner;
class ReverseNum{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;
        int sum=0;
		while(num>0){
			 int rem=num%10;
			 sum=sum*10+rem;
			 num=num/10;
		}
		System.out.println(temp +"   "+sum);

		
	}
}