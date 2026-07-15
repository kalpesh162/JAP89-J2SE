import java.util.Scanner;
import java.util.InputMismatchException;
public class Example1{
	 public static void main(String[] args) {
	 		Scanner scanner=new Scanner(System.in);
			int num1=0; int num2=0;
	 		
	 		System.out.println("Enter num1");
	 		try{
	 				num1=scanner.nextInt();
	 		}catch(InputMismatchException e){
	 		System.out.println("----");
	 		}
	 		System.out.println("Enter num2");
	 		try{
	 		num2=scanner.nextInt();
	 	}catch(InputMismatchException e){
	 			System.out.println("----");
	 	}
	 	
	 		int arr[]={11,22,33,44,55};
	 	try{
	 	
	 		int res=num1/num2;
	 		System.out.println(""+arr[res]);
	 		System.out.println("Remain Code ...");
	 	
	 	}catch(ArithmeticException e){
	 		System.out.println(e);
	 	}
	 	catch(ArrayIndexOutOfBoundsException e){
	 		System.out.println(e);	
	 	}

	 	System.out.println("END");

	 }
}