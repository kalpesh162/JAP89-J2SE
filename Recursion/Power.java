//Write a recursive program to calculate the power of a number (a^b).
import java.util.Scanner;
class Power{
	static int power(int x,int y){
		if(y==1) return x;
		return x*power(x,y-1);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			int x,y;
			System.out.println("Enter X");
			x=scanner.nextInt();
			System.out.println("Enter Y");
			y=scanner.nextInt();

		System.out.println(power(x,y));
	}
}