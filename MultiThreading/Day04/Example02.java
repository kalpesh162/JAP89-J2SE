
class Table{
	// class Level Lock
		public  static  void printTable(int num){
			synchronized (Table.class){
				for(int i=1;i<=5;i++){
				System.out.println(Thread.currentThread().getName() +"  "+(num*i));
			
				}
			}		
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

public class Example02{
	public static void main(String[] args) {
		final Table table1=new Table();   // resource
		final Table table2=new Table();   // resource
		final Table table3=new Table();   // resource

		Harry h1=new Harry(table1);
		h1.setName("Harry");
		Potter p1=new Potter(table2);
		p1.setName("Potter");
		Emma e1=new Emma(table3);
		e1.setName("Emma");
		
		h1.start();
		p1.start();
		e1.start();
	}
}