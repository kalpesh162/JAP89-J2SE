import java.util.Scanner;

class ArmStrongNumber{
	static int countDigits(int n){
		int cnt=0;
		while(n>0){
			cnt++;
			n=n/10;  // n=/10
		}
		return cnt;
	}

	static boolean isArmStrogNum(int n){
			int temp=n;
			int digits=countDigits(n);
			int sum=0;
			while(n>0){
				 int rem=n%10;
				 	sum=sum+getPower(rem,digits);
				 	n=n/10;
			}

			return temp==sum;
	}

	static int getPower(int x,int y){
		int sum=1;
		while(y>0){
			sum=sum*x;
			y--;
		}
		return sum;
	}


	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No ");
		num=scanner.nextInt();

		String msg=isArmStrogNum(num)?"Its ArmStrongNumber" :"Its Not ArmStrongNumber";

		System.out.println(msg);

	}
}