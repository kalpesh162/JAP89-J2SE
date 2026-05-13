import java.util.Scanner;
class Example1{
	/*
	static int reverseNum(int n){
		int sum=0;
		while(n>0){
			 int rem=n%10;
			 sum=sum*10+rem;
			 n=n/10;
		}
		return sum;
	}
*/
	static int reverseNum(int num){
		int sum=0;
		while(num>0){
			 int rem=num%10;
			 sum=sum*10+rem;
			 num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();

		int res=reverseNum(num);
		System.out.println(res);
	}
}