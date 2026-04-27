class Example1{
	public static void main(String[] args) {
			int n=5;
			int cnt=1;
			for(int i=1;i<=n;i++){
				 int c=cnt;
				 for(int j=n;j>=i;j--){
				 	System.out.print((char)(c+64)+"\t");
				 	c=c+j;
				 }
				 cnt++;
				 System.out.println();
			}
	}
}