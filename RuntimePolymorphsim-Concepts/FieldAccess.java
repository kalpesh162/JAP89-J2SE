Ex No 1 :

class A{
    int x=11;

	void f1(){
		System.out.println("A class f1()");
	}
}
class B extends A{
	int x=111;

	void f1(){
		System.out.println("B class f1()" +x);
	}

	void f2(){
	System.out.println("B class f2()");	
	}

}

class App{
	public static void main(String[] args) {
		  
		  A a1=new B();
		  a1.f1();
		  System.out.println(a1.x); 
		 
		  a1.f2();  
	}
}




















Ex No 2:
class A{
    static int x=11;
	
	static void f1(){
		System.out.println("A class f1()");
	}
}
class B extends A{
	
	 static int x=111;

    @Override
	static void f1(){
		System.out.println("B class f1()" +x);
	}

	void f2(){
	System.out.println("B class f2()");	
	}

}

class App{
	public static void main(String[] args) {
		  A a1=new B();
		  a1.f1();  
		  System.out.println(a1.x);  
	}
}







class Super {
 public int field = 0;
 public int getField() { return field; }

}
class Sub extends Super {
 
 public int field = 1;
 
 public int getField() { return field; }
 
 public int getSuperField() {
  return super.field; 
 }

}
public class FieldAccess {

 public static void main(String[] args) {

 Super sup = new Sub(); 
 
 System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
 
 Sub sub = new Sub();

 System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() +", sub.getSuperField() = " +
 sub.getSuperField());
 }

} 




















class StaticSuper {
 public static String staticGet() {                                                        
 return "Base staticGet()";
 }
 public String dynamicGet() {
 return "Base dynamicGet()";
 }
}
class StaticSub extends StaticSuper {

 public static String staticGet() {
 return "Derived staticGet()";
 }
 public String dynamicGet() {
 return "Derived dynamicGet()";
 }

}
public class StaticPolymorphism {

 public static void main(String[] args) {

 StaticSuper sup = new StaticSub(); // Upcast

 System.out.println(sup.staticGet());  // StaticSuper.staticGet()

 System.out.println(sup.dynamicGet());
 }
}














class StaticSuper {
 public static String staticGet() {                                                        
 return "Base staticGet()";
 }

 public String dynamicGet() {
 return "Base dynamicGet()";
 }

}
// static function can not be override
class StaticSub extends StaticSuper {
 public static String staticGet() {
 return "Derived staticGet()";
 }
 public String dynamicGet() {
 return "Derived dynamicGet()";
 }
}
public class StaticPolymorphism {

 public static void main(String[] args) {

 StaticSuper sup = new StaticSub(); // Upcast

 System.out.println(sup.staticGet());  // StaticSuper.staticGet()

 System.out.println(sup.dynamicGet());
 }
}



// static means part of class
// instance function part of an Object
class StaticSuper {
 public static String staticGet() {                                                        
 return "Base staticGet()";
 }

 public String dynamicGet() {
 return "Base dynamicGet()";
 }

}
// static function can not be override
class StaticSub extends StaticSuper {
 @Override
 public static String staticGet() {
 return "Derived staticGet()";
 }

 @Override  // Annotation tells compiler that this function from Patent class
 // as well this Annotation tells novice Programmer that this function overrider form parent class
 public String dynamicGet() {
 return "Derived dynamicGet()";
 }
}


public class StaticPolymorphism {

 public static void main(String[] args) {

 StaticSuper sup = new StaticSub(); // Upcast

 System.out.println(sup.staticGet());  // StaticSuper.staticGet()

 System.out.println(sup.dynamicGet());
 }
}


Example :

// static means part of class
// instance function part of an Object
class StaticSuper {
 public static String staticGet() {                                                        
 return "Base staticGet()";
 }

 public String dynamicGet() {
 return "Base dynamicGet()";
 }

}
// static function can not be override
class StaticSub extends StaticSuper {

 public static String staticGet() {
 return "Derived staticGet()";
 }

 @Override  // Annotation tells compiler that this function from Patent class
 // as well this Annotation tells novice Programmer that this function overrider form parent class
 public String dynamicGet() {
 return "Derived dynamicGet()";
 }
}


public class StaticPolymorphism {

 public static void main(String[] args) {

 StaticSuper sup = new StaticSub(); // Upcast

 System.out.println(sup.staticGet());  // StaticSuper.staticGet()

 System.out.println(sup.dynamicGet());
 }
}


class A{

	static void f1(){

	}
}


class B extends A{

	static void f1(){

	}
}


Static can be inherit

class A{
	static int x=11;
}

class B extends A{

}

Example
class A{
	 static int num=11;

	 static void f1(){
	 	System.out.println("f1 in A class");
	 }
}

class B extends A{

		// if we apply @Override then compiler give an Error
	 static void f1(){
	 	System.out.println("f1 in B class");
	 }

}

// static fields and static function/method can be inherited

class Test{
	public static void main(String[] args) {
		
		System.out.println(A.num);
		System.out.println(B.num);

		B.f1();
	}
}


Example

class A{
	 static int num=11;

	 static void f1(){
	 	System.out.println("f1 in A class");
	 }
}

class B extends A{

		// if we apply @Override then compiler give an Error
	 static void f1(){
	 	System.out.println("f1 in B class");
	 	//super.f1(); this and super cant be use in static context
	 	A.f1();
	 }

}

// static fields and static function/method can be inherited

class Test{
	public static void main(String[] args) {
		
		System.out.println(A.num);
		System.out.println(B.num);

		B.f1();
	}
}







