

// Each Process has at least one Thread

// JVM

// public static  Thread currentThread();

public class Sample01{

	public static void main(String[] args) {

		System.out.println("Hello Java");

		System.out.println(Thread.currentThread());  //Thread[main,5,main]

		// main  --> ThreadGroup
		// 5     --> Priority
		// main  --> Thread Name
				
	}
}