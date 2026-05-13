import java.util.Scanner;
class PrimeCheck1{
	static boolean isPrime(int n){
		if(n==0 || n==1) return false;
		
		for(int i=2;i<n;i++){
			 if(n%i==0) return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();
		for(int i=1;i<=num;i++){
		boolean yesOrNo=isPrime(i);
		if(yesOrNo)
			System.out.println("Prime  :  " + i);
		}
	}
}