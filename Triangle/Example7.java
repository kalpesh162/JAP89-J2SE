/*
12345
 2345
  345
   45
    5 
12345
2345
345
45
5
*/

class Example7{
	
	public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=5;i++){

				// space Loop
				for(int sp=1;sp<i;sp++)
					System.out.print(" ");

				// numbers
				for(int j=i;j<=5; j++){
					//System.out.print(j);
					//System.out.print((char)(64+j));
					System.out.print((char)(64+i));
				}
			System.out.println();
		}
	}
}