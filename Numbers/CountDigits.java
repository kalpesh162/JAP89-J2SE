import java.util.Scanner;
class CountDigits{
	int x;  // instance Field  0
	
	public static void main(String[] args) {
		int x;  // Unintialized
		System.out.println(x);  // If we use such a variable that is not intialized
		// then compiler give Error  variable x might not have been 

		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;  // COPY  
		int cnt=0;
		while(num>0){
			num=num/10;
			cnt++;
		}
		System.out.println("Num  "+temp+"  CountDigits "+cnt);
	}
}