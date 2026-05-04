/*
E
Ed
EdC
EdCb
EdCbA
EdCb
EdC
Ed
E
*/
class Example6{
	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<2*n;i++){
			if(i<=n){
				for(int j=1;j<=i;j++){
					//System.out.print(n-j+1);
					if(j%2==0)
						System.out.print((char)((n-j+1)+96));
					else
						System.out.print((char)((n-j+1)+64));
				}

			}
			else{  // i=6 
				for(int j=1;j<=2*n-i;j++)
					// j=1
					///System.out.print(n-j+1);
					if(j%2==0)
						System.out.print((char)((n-j+1)+96));
					else
						System.out.print((char)((n-j+1)+64));
			}

			System.out.println();
		}
	}
}