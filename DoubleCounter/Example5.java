/*
Ea      Db      Cd      Bg      Ak
Ic      He      Gh      Fl
Lf      Ki      Jm
Nj      Mn
Oo
*/
class Example5{
	public static void main(String[] args) {
		int n=5;
		int cnt1=n;
		int cnt2=1;
		for(int i1=n,i2=1 ; i2<=n ;i2++, i1--){
                int c1=cnt1; int c2=cnt2;

                for(int j2=i2 , j1=i1; j2<=n;j2++,j1--){
                	  System.out.print((char)(c1+64));
					  System.out.print((char)(c2+96)+"\t");
					  c1--;
					  c2=c2+j2;
                }
                cnt1=cnt1+(i1-1);
                cnt2=cnt2+(i2+1);
                System.out.println();
		}
	}
}