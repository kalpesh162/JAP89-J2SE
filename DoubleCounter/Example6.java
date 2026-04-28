/*
                                OA
                        JC      NB
                FF      IE      MD
        CJ      EI      HH      LG
AO      BN      DM      GL      KK

*/

class Example6{
	public static void main(String[] args) {
		int n=5;
		int cnt1=1;
		int cnt2=n*(n+1)/2;
		for(int i1=1,i2=n;i1<=n;i1++,i2--){
				int c1=cnt1;
				int c2=cnt2;
				for(int sp=i1;sp<n;sp++)
					System.out.print("\t");

              for(int j1=1,j2=i2;j1<=i1;j1++,j2++){
              		System.out.print((char)(c2+64));
              		System.out.print((char)(c1+64)+"\t");
              		c1--;
              		c2=c2+j2;
              }

              	cnt1=cnt1+i1+1;
              	cnt2=cnt2-i2;
              	System.out.println();

		}
	}
}