/*
i=1   *
i=2   **
i=3   ***
i=5   ****
i=5   *****
*/
class Example1{
	public static void main(String[] args) {		
        int n=50;
        for(int i=1;i<=n;i++){
        	  for(int j=1;j<=i;j++){
        	  	System.out.print("*");
        	  }
        	  System.out.println();
        }

	}
}
/*
1
22
333
4444
55555
*/
