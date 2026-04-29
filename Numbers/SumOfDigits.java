import java.util.Scanner;
class SumOfDigits{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			 int rem=num%10;
			 sum=sum+rem;
			 num=num/10;
		}

		System.out.println(temp +"  "+sum);
	}
}