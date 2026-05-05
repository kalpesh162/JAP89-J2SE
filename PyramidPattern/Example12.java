/*
*       *
**     **
***   ***
**** ****
*********
*/
class Example12{
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n ; i++) {

			if(i==n){
				for(int j=1;j<=n;j++)
					System.out.print(j);
				for(int j=n-1;j>=1;j--)
					System.out.print(j);
			}
			else{
				for(int j=1;j<=i;j++)
					System.out.print(j);

				for(int sp=1 ; sp<(n-i)*2 ;sp++){
						System.out.print(" ");
				}

				for(int j=i;j>=1;j--)
					System.out.print(j);

			}

			System.out.println();
		}
	}
}