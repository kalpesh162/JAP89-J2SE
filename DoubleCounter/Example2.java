class Example2{
	public static void main(String[] args) {
		int n=5;
		int cnt=n*(n+1)/2;
		for(int i=1;i<=n;i++){
			  int c=cnt;
			  for(int j=i;j<=n;j++){
			  	 //System.out.print(c+"\t");
			  	System.out.print((char)(c+64)+"\t");
			  	 c=c-j-1;
			  }
			  cnt=cnt-i;
			  System.out.println();
		}
	}
}
