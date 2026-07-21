
// standalone class Thread then use extends Thread
class MyThread extends Thread{
		// work
	@Override
	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println(5*i +"  "+Thread.currentThread().getName());
	}

}

public class Sample02{
	public static void main(String[] args) {
		
		// 
		MyThread t1=new MyThread();
		t1.setName("Banti");
		//t1.run();
		t1.start();  // Here is Thread Created 

		for(int i=1;i<=10;i++)
			System.out.println(11*i +"  "+Thread.currentThread().getName());

	}
}

/*
// 
public class Thread implements Runnable{
	 Thread()
	 public Thread currentThread()
	 public void setName(String name)
	 public String getName()
}
*/