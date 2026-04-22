/*
5
44
333
2222
11111
*/

class Example2{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--){
    // j    i
    // 5    5
	// 6  <=  5

	// j    i
    // 5    5
	// 4  >=  5
    
            for(int j=n; j>=i  ;j--)
            	System.out.print(i);
            System.out.println();

		}

	}
}


//j=i;j<=5;j++