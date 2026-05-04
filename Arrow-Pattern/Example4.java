/*
1
22
333
4444
55555
4444             i=6       2*n-i     2*n-6
333              i=7	   2*n-i	 2*n-7	
22               i=8	   2*n-i	 2*n-8
1                i=9	   2*n-i	 2*n-9
*/
class Example4{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<n*2;i++){
			if(i<=5){	
					for(int j=1;j<=i;j++)
						System.out.print(i);
						System.out.println();
			}
			else{
					for(int j=i;j<n*2;j++)
					System.out.print(2*n-i);
					System.out.println();

			}

		}
	}
}