//int x=5; x++ POSt   ++x Pre  
class Sample4{
	public static void main(String arr[]){
		int a=5;
		int b=3;

		int res=a++ + ++b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(res);
	}
}