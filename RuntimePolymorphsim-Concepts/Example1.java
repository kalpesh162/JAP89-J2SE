// Can static inherited ?

class A{
	static int x=11;
}

class B extends A{

}

class Example1{
	public static void main(String[] args) {
		
		System.out.println(A.x);
		System.out.println(B.x);

		A a1=new A();
		System.out.println(a1.x); // A.x

		B b1=new B();
		System.out.println(b1.x); 



	}
}