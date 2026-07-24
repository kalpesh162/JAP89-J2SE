class Counter{
	// data 
	int cnt=0;
	public synchronized void increment(){
		 cnt++;
	}
}
class One extends Thread{
	Counter counter;
	One(Counter counter){ this.counter=counter;}
	 public void run(){
	 	for(int i=1;i<=10000;i++)
	 	counter.increment();
	 }
}
class Two extends Thread{
	Counter counter;
	Two(Counter counter){ this.counter=counter;}
	 public void run(){
	 	for(int i=1;i<=10000;i++)
	 	counter.increment();
	 }
}

public class Example03{
	public static void main(String[] args) throws InterruptedException{
		final Counter counter =new Counter();
		One t1=new One(counter);
		Two t2=new Two(counter);

		t1.start();

		t2.start();

		t1.join();
		t2.join();	

		System.out.println("Counter  "+counter.cnt);  // main 
		
	}
}