class Example3{
	public static void main(String[] args) {
		int n=5;
		int cnt1=1;
		int cnt2=n*(n+1)/2;

		for(int i=1;i<=n;i++){

				// space loop
			   for(int sp=1;sp<i;sp++)
			   	System.out.print("\t");

				int c1=cnt1;
				int c2=cnt2;
				for(int j1=n,j2=i; j2<=n ;j1-- , j2++){
					System.out.print((char)(c1+64));
					System.out.print((char)(c2+64)+"\t");
					c1=c1+j1;
					c2=c2-j2-1;
				}
				 cnt1++;
				 cnt2=cnt2-i;
				 System.out.println();
		}
	}
}