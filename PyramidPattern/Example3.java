/*
*********
 *******
  *****
   ***
    *
*/

class Example3{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1 ;i--){

			for(int sp=i;sp<n;sp++)
				System.out.print(" ");

			 for(int j=1;j<=2*i-1;j++)
			 	System.out.print("*");

			 System.out.println();
		}

	}
}