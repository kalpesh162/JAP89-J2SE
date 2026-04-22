/*
    1
   21
  321
 4321
54321
*/
class Example6{
	 public static void main(String[] args) {
	 	int n=9;
	 	
	 	for(int i=1;i<=n;i++){
	 			//for(int sp=1;sp<=n-i;sp++)
	 		// Space Loop
	 			for(int sp=i;sp<n;sp++)
	 				System.out.print(" ");

	 		// print numbers	
	 			for(int j=i;j>=1;j--)
	 				System.out.print(j);
	 			System.out.println();
	 	}
	 }
}