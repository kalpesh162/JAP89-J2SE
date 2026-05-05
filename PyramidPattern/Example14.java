/*
A       A
bA     Ab
CbA   AbC
dCbA AbCd
EdCbAbCdE
*/

class Example14{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			if(i==n){
				for(int j=n;j>=1;j--){
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));	
				}
					
				for(int j=2;j<=n;j++){
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));	
				}
					
			}
			else{
				for(int j=i;j>=1;j--){
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));	
				}

				for(int sp=1 ;sp<(n-i)*2 ;sp++)
					System.out.print(" ");
				

				for(int j=1;j<=i;j++){
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));	
				}


			}
			System.out.println();

		}
	}
}