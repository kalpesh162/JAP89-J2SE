/*
    *
   * *
  *   *
 *     *
*********
*/
class Example4{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			
			for(int sp=i;sp<n;sp++)
				System.out.print(" ");

			 for(int j=1;j<=2*i-1;j++){
			 	if((j==1) || (i==n) || (j==(2*i-1)))
			 	System.out.print("*");
			 	else
			 	System.out.print(" ");
			 }
			 System.out.println();
		}
	}
}