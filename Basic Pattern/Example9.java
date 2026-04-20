/*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA
*/
class Example9{
	
	public static void main(String[] args) {
	       int n=5;
			for(int i=n;i>=1;i--){
				for(int j=1;j<=n;j++){
					 System.out.print((char)(64+i));
					//System.out.print((char)(96+i));
				}
				System.out.println();
			}
	}
}