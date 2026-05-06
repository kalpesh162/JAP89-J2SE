
//             i=1   i=2   i=3    i=4   i=5    
/*       j  12345 12345 12345 12345 12345
k=1	i=1		***** ***** ***** ***** *****
k=2			***** ***** ***** ***** *****
			***** ***** ***** ***** *****
			***** ***** ***** ***** *****
			***** ***** ***** ***** *****
*/

class Example2{

	public static void main(String[] args) {
		
		int n=5;
		for(int k=1;k<=n;k++){
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
						System.out.print("*");
					}
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}