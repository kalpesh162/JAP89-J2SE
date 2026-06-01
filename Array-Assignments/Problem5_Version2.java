/*
Array Case 5: Average of Odd and Even Elements
 
From a given array, separately calculate:
- Average of odd elements
- Average of even elements
 
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Odd elements = 5, 15, 25 â†’ Average = 15.0
Even elements = 10, 20 â†’ Average = 15.0

*/

import java.util.Scanner;


class Problem5_Version2{

	static void inputArray(int arr[],Scanner scanner){
		// arr.length its property
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Elements");
			 arr[i]=scanner.nextInt();
		}

	}

	static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");

		System.out.println();

	}

	// Note return Type double[]
	static double[] getOddEvenAvgElemnts(int arr[]){

		double ans[]=new double[2]; // Array Creation --> Defaulr Values 0.0
		double sumEven=0.0;
		double sumOdd=0.0;
		int evenCnt=0;
		int oddCnt=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				sumEven=sumEven+arr[i];  // sumEven+=arr[i]
				evenCnt++;
			}
			else{
				sumOdd=sumOdd+arr[i];
				oddCnt++;
			}
		}

		ans[0]=sumEven/evenCnt;
		ans[1]=sumOdd/oddCnt;
		return ans;
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

		display(arr);

		double res[]=getOddEvenAvgElemnts(arr);

		System.out.println("Even Elements AVG  "+res[0]);
		System.out.println("Odd Elements AVG  "+res[1]);

		
	}
}