// When logically class is complete will go for final
final class A{
	int x=11;
	void f1(){

	}
}

// Blocked for inhertitance
// cannot inherit from final A
class B extends A{


}
class Test{
	public static void main(String[] args) {
		
		A a1=new A();
		A a2=new A();
		a1=a2;
		/*
		final A a1=new A();
		A a2=new A();
		a1=a2;
		*/
		a1.x=22;
		
	}
}