class Task extends Thread{
	private static final String RED="\033[101m";
	private static final String RESET="\033[0m";	
	  public void run(){
	  	int percent=0;
	  	for(int i=1;i<=10;i++){
	  		System.out.print("\r[");
	  		for(int j=1;j<=i;j++){
	  			System.out.print("=");
	  		}
	  		percent=percent+10;
	  		System.out.print("] "+"  "+RED+percent+" "+RESET);
	  		try{ Thread.sleep(1000);} catch(InterruptedException e){}
	  	}
	  }
}

public class ProgressBar{
	public static void main(String[] args) {
			Task t1=new Task();
			t1.start();
	}
}