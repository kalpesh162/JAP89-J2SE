import java.util.Scanner;
class Operation{

	static int doAdd(int x,int y){
		// Local Variable
		// Scope Blocked
		int res=x+y;
		
		return res;

	}

	static  int cube(int x){
		 return x*x*x;
	}
	
	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1");
		num1=scanner.nextInt();
		System.out.println("Enter Num1");
		num2=scanner.nextInt();

		int res=doAdd(num1,num2);  // CALL
		System.out.println(res);
		int ans=cube(res);
		System.out.println(ans);

	}
}