interface I1{
	 default void sayHi(){
	 	System.out.println("I1 :: sayHi");
	 }	 
}

// While Overriding default method make Access Specifier as public
class A implements I1{

	/*
	@Override
	public void sayHi(){
	 	System.out.println("A :: sayHi");
	 	//I1.sayHi();
	 	//super.sayHi();
	 }
	 */
	 public void sayHi(){
	 	System.out.println("A :: sayHi");
	 	I1.super.sayHi();
	 }
}
class App{
	public static void main(String[] args) {
			I1 i1=new A();
			i1.sayHi();
	}
}