/*
    *
   ***
  *****
 *******
*********
*/
class Example1{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			
			for(int sp=i;sp<n;sp++)
				System.out.print(" ");

			 for(int j=1;j<=2*i-1;j++)
			 	System.out.print("*");
			 System.out.println();
		}
	}
}