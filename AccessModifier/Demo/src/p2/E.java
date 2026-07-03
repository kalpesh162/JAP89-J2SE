package p2;
import p1.A;
// E is subclass
// E can inherit member of A
public class E extends A{

	void f1(){
		 System.out.println(publicField+10);
		 System.out.println(procField+10);

	}

	public static void main(String[] args) {
		A a1=new A();
		//System.out.println(a1.procField);
		System.out.println(a1.publicField);

		System.out.println("---------------");
		E e1=new E();
		System.out.println(e1.procField);
		System.out.println(e1.publicField);


	}

}