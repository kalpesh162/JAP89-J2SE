

class MyRunnable implements Runnable{
	// BRICKS
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.print(5*i+" "+Thread.currentThread().getName() +"  ");
			System.out.println(Thread.currentThread().getId());
		}
	}
}

public class Sample03{
	public static void main(String[] args) {
		MyRunnable myrun=new MyRunnable();  // Work Bricks
		Thread t1=new Thread(myrun);  // Worker  Donkey

		t1.start();

		for(int i=1;i<=5;i++){
			System.out.print(11*i+" "+Thread.currentThread().getName()+"  ");
			System.out.println(Thread.currentThread().getId());
		}

	}
}



/*
public class Thread extends Object implements Runnable{
	  Thread()
	  Thread(Runnable runnable)
}
*/