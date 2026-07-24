
class A extends Thread{
	public void run(){
		  for(int i=1;i<=100;i++){
		  	System.out.print("");
		  }
	}

}

class B extends Thread{
	public void run(){
		  for(int i=1;i<=100;i++){
		  	System.out.print(" ");
		  }
	}

}

class C extends Thread{
	public void run(){
		  for(int i=1;i<=100;i++){
		  	System.out.print("");
		  }
	}

}

public class Example01{
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(" Active Count "+Thread.activeCount());
		A a1=new A();
		B b1=new B();
		C c1=new C();
		System.out.println("==>  "+a1.getId());
		a1.start(); 
		System.out.println("-->  "+a1.getId());
		b1.start();
		b1.join();
		c1.start();
		if(a1.isAlive())
			System.out.println("A Live");

		if(b1.isAlive())
			System.out.println("B Live");
		if(c1.isAlive())
			System.out.println("C Live");
		

		Thread.sleep(0,1);

		System.out.println(" Active Count "+Thread.activeCount());

		if(a1.isAlive())
			System.out.println("A Live");
		if(b1.isAlive())
			System.out.println("B Live");
		if(c1.isAlive())
			System.out.println("C Live");

		if(Thread.currentThread().isAlive())
			System.out.println("main Alive");
	}
}