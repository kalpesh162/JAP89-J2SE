import java.util.Scanner;

class Program1{
		public  static void display(int A[]){
			for(int i=0;i<A.length;i++){
				System.out.printf("i: %d  A:[%d]  = %d  \n",i,i,A[i]);
				A[i]=A[i]*10;
			}
		}

	   public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size;
		System.out.println("Enter Size of An Array");
		size=scanner.nextInt();

		// Validatio Check
		if(size<=0){
			System.out.println("Always Enter Positive");
			System.exit(-1);
		}	   	

		int arr[]=new int[size];

		//for(int i=0;i<size;i++)
		for(int i=0;i<arr.length;i++){
				System.out.println("Enter Element ");
				arr[i]=scanner.nextInt();		
		}

		// printing an Array
		for(int i=0;i<arr.length;i++)
			System.out.println(""+i + "  "+arr[i]);

		System.out.println("----------------");

   // arr is a type int[]
		display(arr);
		System.out.println("----------------");

		for(int i=0;i<arr.length;i++)
			System.out.println(""+i + "  "+arr[i]);



	   }
}