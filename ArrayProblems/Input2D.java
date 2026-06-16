import java.util.Scanner;

public class Input2D{

	public  static void inputArray(int arr[][],Scanner scanner){

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter ");
				arr[i][j]=scanner.nextInt();
			}	
		}

	}
	public  static void display(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] +"  ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int rows;
		int columns;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows ");
		rows=scanner.nextInt();
		System.out.println("Enter Columns ");
		columns=scanner.nextInt();

		if(rows<=0 || columns<=0){
			System.out.println("Enter Corrects Rows and Columns ");
			System.exit(-1);
		}

		int arr[][]=new int[rows][columns];

		inputArray(arr,scanner);

		display(arr);
		

	}

}