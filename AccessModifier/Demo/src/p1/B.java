package  p1;
public class B{
	public static void main(String[] args) {
		A a1=new A();
		//System.out.println(a1.privateField);
		System.out.println(a1.defaultField);
		System.out.println(a1.procField);
		System.out.println(a1.publicField);

		System.out.println("---------------------");

		C c1=new C();

		//System.out.println(c1.privateField);
		System.out.println(c1.defaultField);
		System.out.println(c1.procField);
		System.out.println(c1.publicField);



	}
}