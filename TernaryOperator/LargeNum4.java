import java.util.Scanner;
class LargeNum4{
	public static void main(String[] args) {
			int n1,n2,n3,n4,large;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter N1");
			n1=scanner.nextInt();
			System.out.println("Enter N2");
			n2=scanner.nextInt();
			System.out.println("Enter N3");
			n3=scanner.nextInt();
			System.out.println("Enter N4");
			n4=scanner.nextInt();
			
	large=(n1>n2 &&  n1>n3  && n1>n4) ? n1 : (n2>n3 && n2>n4) ? n2 : (n3>n4) ? n3 : n4;

			System.out.println("large  "+large);
};
}