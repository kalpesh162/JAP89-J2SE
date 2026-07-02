class A{
	final void f1(){

	}
}

class B extends A{
	//f1() in B cannot override f1() in A
	@Override
	void f1(){
		System.out.println("B class f1()");
	}

}

class App{
	public static void main(String[] args) {
		A a1=new B();
		a1.f1();
	}
}