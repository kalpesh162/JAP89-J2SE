import java.util.Scanner;
class LargeNum{
	public static void main(String[] args) {
			int n1,n2,large;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter N1");
			n1=scanner.nextInt();
			System.out.println("Enter N2");
			n2=scanner.nextInt();
			// if() else  OR  ? :
			// (cond) ? true : false

			large=(n1>n2) ? n1 : n2 ;

			System.out.println("large  "+large);

	}
}