/*
    1
   121
  12321
 1234321
123454321
*/
class Example7{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			 // Space triangle
			 for(int sp=i;sp<n;sp++)
			 	System.out.print(" ");

			 // another triangle
			 for(int j=1; j<=i ;j++)
			 	System.out.print(j);

			 // last triangle
			 for(int j=i-1;  j>=1 ;j--)
			 	System.out.print(j);

			 System.out.println();
		}
	}
}