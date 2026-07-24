// What is Racc Condittion
// How o=to avoid Race Condittion
// What problem leads to if we dont synchronized  
class Table{
/*
	public synchronized  void printTable(int num){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(num*i));
			/*
			if(Thread.currentThread().getName().equals("Harry")){
			try{
			 Thread.sleep(1000);
			}catch(InterruptedException e){
			
			}
		}
		
		}
	*/

		public   void printTable(int num){
			synchronized (this){
				for(int i=1;i<=5;i++){
				System.out.println(Thread.currentThread().getName() +"  "+(num*i));
			
				}
			}

			// non -synchronized code
		
		}
}

// sleep doesnt releas lock


class Harry extends Thread{
	Table table;
	Harry(Table table){ this.table=table;}

        @Override
        public void run(){
        	table.printTable(5);
		}
}

class Potter extends Thread{
	Table table;
	Potter(Table table){ this.table=table;}

	  @Override
        public void run(){
		table.printTable(11);
	}
	
}


class Emma extends Thread{
	Table table;
	Emma(Table table){ this.table=table;}
	  @Override
        public void run(){
			table.printTable(13);
	}
	
}

public class Example03{
	public static void main(String[] args) {

		final Table table=new Table();

		Harry h1=new Harry(table);
		h1.setName("Harry");
		Potter p1=new Potter(table);
		p1.setName("Potter");
		Emma e1=new Emma(table);
		e1.setName("Emma");

/*
		h1.setPriority(10);
		p1.setPriority(9);
		e1.setPriority(7);
*/
		h1.start();
		p1.start();
		e1.start();

		try{
			 Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}

		/*
		for(int i=1;i<=5;i++)
		System.out.println("*****THANK YOU *****"+i);
		*/	
	}
}