interface I1{
	 void f1();
	 // Java 8
	 default void f2(){
	 	System.out.println("I1 :: f2()");
	 }
	 // default method is not compulsary to override

	 // This method belogs to inteface 
	 static void methodA(){
	 	System.out.println("Hello Static method");
	 }
	 // static cant be Override
}

class A implements I1{
	public void f1(){
		System.out.println("A class f1()");
	}

}

class App{
	public static void main(String[] args) {
		I1 i1=new A();
		i1.f1();
		i1.f2();	
		System.out.println("-----");
		A a1=new A();
		a1.f1();
		a1.f2();
		System.out.println("-----");
		I1.methodA();
		//i1.methodA();  //illegal static interface method call


		//a1.methodA();
	}
}