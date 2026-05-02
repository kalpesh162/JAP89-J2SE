/*
54321
44321
33321
22221
11111
*/
class Example4{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=i;j<=n;j++)
				System.out.print(i);
			for(int k=i;k>1;k--)
				System.out.print(k-1);

			System.out.println();

		}
	}
}