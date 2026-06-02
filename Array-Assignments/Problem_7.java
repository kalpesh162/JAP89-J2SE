/*
Array Case 7: Shift First Element to Last
WAP to shift first element to last from array
Example Input:
input: {10,20,30,40,50}
output:{20,30,40,50,10}
*/
import java.util.Scanner;
class Problem_7{

	public  static void inputArray(int arr[],Scanner scanner){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Elements");
			arr[i]=scanner.nextInt();
		}
	}

	public static void displayArray(int arr[]){
		System.out.println("DISPLAY ARRAY ");
		for(int ele:arr)
			System.out.print(ele+"  ");
		System.out.println();
	}

	public static void shiftToLast(int arr[]){
		// step 1
		int temp=arr[0];

		for(int i=1;i<arr.length;i++)
			arr[i-1]=arr[i];
		/*
		for(int i=0;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		*/
		arr[arr.length-1]=temp;
	}


	public static int[] shiftToLast1(int A[]){
		int arr[]=new int[A.length];  // New Array Create
		// step 1
		int temp=A[0];

		for(int i=1;i<arr.length;i++)
			arr[i-1]=A[i];
		/*
		for(int i=0;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		*/
		arr[arr.length-1]=temp;

		return arr;
	}

	public static void main(String[] args) {
		int size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size of An Array");
		size=scanner.nextInt();
		// int arr[]=new int[-5];  ArrayNegativeException
		// size=0 
		if(size<=0){
			 System.out.println("Size Always Positive ");
			 System.exit(-1);
		}
		int arr[]=new int[size];

		inputArray(arr,scanner);

		displayArray(arr);

		//shiftToLast(arr);

		displayArray(arr);
		System.out.println("-------------------------");
		int B[]=shiftToLast1(arr);

		displayArray(B);
		displayArray(arr);



	}
}