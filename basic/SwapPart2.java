// Swap Without Third Variable
class SwapPart2{
	public static void main(String a[]){
		 int N1=10;
		 int N2=20;
		System.out.print("N1  ");
		System.out.println(N1);
		System.out.print("N2  ");
		System.out.println(N2);
		 N1=N1+N2;
		 N2=N1-N2;
		 N1=N1-N2;
		 System.out.println("------------------");
		System.out.print("N1  ");
		System.out.println(N1);
		System.out.print("N2  ");
		System.out.println(N2);
	}
}