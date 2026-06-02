/*
Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
Output:{50,10,20,30,40}
*/

import java.util.Scanner;
class Problem_8{

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

	public static void shiftLastToFirst(int arr[]){
		// step 1
		int temp=arr[arr.length-1];

		for(int i=arr.length-1;i>0;i--)
			arr[i]=arr[i-1];
		/*
		for(int i=0;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		*/
		arr[0]=temp;
	}

	public static int[] shiftLastToFirst1(int A[]){
		// HW  COmplete
		return null;
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

		shiftLastToFirst(arr);
		
		displayArray(arr);


	}
}