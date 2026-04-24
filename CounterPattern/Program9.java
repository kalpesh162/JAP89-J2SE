/*

11
7    12   
4     8    13
2     5     9   14
1     3     6   10   15
*/

class Program9{
	public static void main(String[] args) {
			int n=5;
			int cnt=n*(n-1)/2+1;
            for(int i=n;i>=1;i--){

            		for(int sp=1;sp<i;sp++)
            			System.out.print("\t");

            		int c=cnt;
            		for(int j=i;j<=n;j++){
            			 System.out.print((char)(c+64)+"\t");
            			 // c=7  j=4
                         c=c+(j+1);
            		}
            		cnt=cnt-(i-1);
            		System.out.println();
            }


	}
}