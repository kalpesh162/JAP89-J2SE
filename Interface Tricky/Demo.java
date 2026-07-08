
class A{

}

class B extends A{

}

class M{

}

interface Hello{

}

//class Bye  extends Object implements Hello{
class Bye implements Hello{

}
class Demo{
	public static void main(String[] args) {
			A a1=new A();
			B b1=new B();

			A a2=new B();

			M m1=new M();
			//objectName instanceof ClassName

			boolean yesOrNot=b1 instanceof B;	
			System.out.println(b1 instanceof B);
			System.out.println(m1 instanceof M);
			//System.out.println(m1 instanceof b1);

			System.out.println(a1 instanceof Object);

			Bye bye1=new Bye();

			System.out.println(bye1 instanceof Hello);
			System.out.println(bye1 instanceof Object);
			//System.out.println(Hello instanceof Object);
			Hello hello=new Bye();
			System.out.println(hello instanceof Object);
			







	}
}