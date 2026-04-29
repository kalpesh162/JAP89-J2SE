import java.util.Scanner;
class ProductOfDigits{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;
		int sum=1;
		while(num>0){
			 int rem=num%10;
			 sum=sum*rem;
			 num=num/10;
		}

		System.out.println(temp +"  "+sum);
	}
}