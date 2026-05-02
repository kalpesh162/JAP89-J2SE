/*
5
44
333
2222
11111
2222
333
44
5
*/
class Example5{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<n*2;i++){
			if(i<=5){	
				     // space loop
					for(int j=1;j<=i;j++)
						//System.out.print(n-i+1);
					System.out.print(i);
						System.out.println();
			}
			else{
				   // space loop
				   // i=6 n=5  n*2=10
					for(int j=i;j<n*2;j++)
					System.out.print(i-n+1);
					System.out.println();

					// i=6   i-n+1  (6-5+1)   loop j  --> 4 times
					// i=7   i-n+1  (7-5+1)   loop j  --> 3 times
					// i=8   i-n+1  (8-5+1)   loop j  --> 2 times
					// i=9   i-n+1  (9-5+1)   loop j  --> 1 times
			}

		}
	}
}