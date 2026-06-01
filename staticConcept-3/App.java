class Data{
	private static Data d1;
	private Data(){}
	
	public static  Data getInstance(){
		 if(d1==null)
		  d1=new Data();	 
		 return d1;
	}
}

class App{
	public static void main(String[] args) {

		//Data d1=new Data();		
		Data d1=Data.getInstance();
		Data d2=Data.getInstance();
		Data d3=Data.getInstance();
		Data d4=Data.getInstance();

		System.out.println("******");
	}
}