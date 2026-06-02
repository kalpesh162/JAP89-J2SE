class TwoD{
	public  static void display(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] +"  ");
			}
			System.out.println();

		}
	}

	public  static void display1DArray(int arr[]){
			for (int i=0;i<arr.length ;i++ ) {
				System.out.println(arr[i]);
			}
	}

	public static void main(String[] args) {

		int arr[][]={{11,22,33},{44,55,66},{77,88,99}};

		// 3 rows 3 columns

		// Display
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j] +"  ");
			}
			System.out.println();

		}

		display(arr);  // What is the type of arr

		for(int i=0;i<arr.length;i++)
		display1DArray(arr[i]);  // What is the type of arr[0]  int[]   |   arr[1]  int[]  |  arr[2]  int[]
		
	}
}