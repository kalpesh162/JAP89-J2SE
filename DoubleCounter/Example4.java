/*
OO      NJ      LF      IC      EA
MN      KI      HE      DB
JM      GH      CD
FL      BG
AK
*/

class Example4{
	public static void main(String[] args) {
				int n=5;
				int cnt1=n*(n+1)/2;
				int cnt2=cnt1;

				for(int i=1;i<=n;i++){
					 int c1=cnt1;
					 int c2=cnt2;
					 for(int j1=i,j2=n ; j1<=n;j1++,j2--){
					 	  System.out.print((char)(c1+64));
					 	  System.out.print((char)(c2+64)+"\t");
					 	  c1=c1-j1;
					 	  c2=c2-j2;
					 }
					 cnt1=cnt1-(i+1);
					 cnt2--;
					 System.out.println();
				}
	}
}