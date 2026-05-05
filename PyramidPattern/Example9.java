/*
*       *
**     **
***   ***
**** ****
*********
*/
class Example9{
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n ; i++) {

			if(i==n){
				for(int j=1;j<2*n;j++)
					System.out.print("*");
			}
			else{
				for(int j=1;j<=i;j++)
					System.out.print("*");

				for(int sp=1 ; sp<(n-i)*2 ;sp++){
						System.out.print(" ");
				}

				for(int j=1;j<=i;j++)
					System.out.print("*");

			}

			System.out.println();
		}
	}
}