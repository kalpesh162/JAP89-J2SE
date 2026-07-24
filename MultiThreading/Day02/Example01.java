class Ram extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(5*i));
		}
	}
}
class Shyam implements Runnable{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(11*i));
		}
	}
}

public class Example01{
	public static void main(String[] args) {
		Ram ram=new Ram();
		ram.setName("Ram");
		Shyam shyam=new Shyam();  // type of Runnable  // WORK
		Thread t1=new Thread(shyam); // Worker
		t1.setName("Shyam");

		ram.start();
		try{
		ram.join();
	}catch(InterruptedException e){

	}
		
		t1.start();
		try{
		t1.join();
	}catch(InterruptedException e){

	}   
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(17*i));
			try{
			Thread.sleep(1000);    //TIMED_WAITING
			}catch(InterruptedException e){
				System.out.println("  "+e);
			}

		}
		
	
	}
}

// How threads runs sequentially 