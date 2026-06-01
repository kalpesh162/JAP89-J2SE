/*
Array Case 1: Forward and Backward Display
 Create an array of integers, store elements in it, and display the elements:
- In forward order (from first to last)
- In backward order (from last to first)
 Example Input:
  Array = [10, 20, 30, 40, 50]
  Expected Output:
  Forward: 10 20 30 40 50
  Backward: 50 40 30 20 10
*/

import java.util.Scanner; 
class Program1{

	static void inputArray(int arr[],Scanner scanner){
		// arr.length its property
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Elements");
			 arr[i]=scanner.nextInt();
		}

	}

	static void forwardDisplay(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");

		System.out.println();

	}
	static void backwardDisplay(int arr[]){

		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+"  ");

		System.out.println();
		
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

		System.out.println("Display Array : Forward");
		forwardDisplay(arr);
		System.out.println("Display Array : Backward");
		backwardDisplay(arr);

	}
}