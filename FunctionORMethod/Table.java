import java.util.Scanner;
class Table{
	static void printTable(int n){
		for(int i=1;i<=10;i++)
			System.out.printf("%4d * %3d  =  %5d \n",n,i,(n*i));

		System.out.println("---------------------------------------");
	}
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();
		for(int i=1;i<=num;i++)
		printTable(i);
	}
}