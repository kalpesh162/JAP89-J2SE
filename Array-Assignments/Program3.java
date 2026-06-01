/*
Array Case 3: Average of Array Elements
Find the average value of all elements in an array.
Example Input:
 Array = [2, 4, 6, 8, 10]

Expected Output:
Average = 6.0

*/
import java.util.Scanner;

class Program3{

	static void inputArray(int arr[],Scanner scanner){
		// arr.length its property
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Elements");
			 arr[i]=scanner.nextInt();
		}

	}

	// displayArray

	static double avgOfArray(int arr[]){
		double sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];

		return (sum/arr.length);

	}


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=scanner.nextInt();

		// Validation Check
		if(size<=0){
			System.out.println("Enter Positive Size and greater than 0");
			System.exit(-1); // -1 Status Code
		}
		int arr[]=new int[size];// Array Creation
		//int arr[]=new int[5];// Array Creation
		// arr is a 1-D Array which has 5 elements are of type integers

		inputArray(arr,scanner);  // what is type of arr --> int[]

		double avg=avgOfArray(arr);

		System.out.println("Avg "+avg);


	}
}