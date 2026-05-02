/*
*
**
***
****
*****
****
***
**
*
*/
class Example2{
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++){
			if(i<=5){	
					for(int j=1;j<=i;j++)
						System.out.print("*");
						System.out.println();
			}
			else{

					for(int j=i;j<=n;j++)
					System.out.print("*");
					System.out.println();

			}

		}
	}
}