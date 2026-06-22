import java.util.Scanner;
import java.util.Random;

public class InsertArrayElement{

	public static void displayArray(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.println(i+"  "+A[i]);
		}
	}
	
	public static void inpuArray(Scanner scanner,int A[]){
		Random random=new Random();
			for(int i=0;i<A.length;i++){
			//	System.out.println("Enter ");
				A[i]=random.nextInt(100);
			}

	}

	public static int[] insertElementAtPos(int A[],int pos,int ele){
		int B[]=new int[A.length+1];

		for(int j=0;j<pos-1;j++)
			B[j]=A[j];

		B[pos-1]=ele;
		int i=pos-1;
		for(int j=pos;j<B.length;j++){
			B[j]=A[i];
			i++;
		}

		return B;

	}

	public static void main(String[] args) {
			int size;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Size of an Array");
			size=scanner.nextInt();
			int A[]=new int[size];

			inpuArray(scanner,A);
			displayArray(A);
			int pos; int ele;
			System.out.println("Enter Element");
			ele=scanner.nextInt();
			System.out.println("Enter position to be Inserted");
			pos=scanner.nextInt();

			A=insertElementAtPos(A,pos,ele);

			displayArray(A);




	}
}