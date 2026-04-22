/*
A
BB
CCC
DDDD
EEEEE
1
22
333
4444
55555
 A  65
 a  97
 0  48
    32
*/
class Example3{
	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				// Narrowing
				System.out.print((char)(64+i));
			}
			System.out.println();
		}

	}
}


