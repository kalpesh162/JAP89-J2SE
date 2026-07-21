public class Example05{

	static void f1(){

		try{
			System.out.println("Inside try Block");
			return ;
		}
		finally{
			System.out.println("finally Block Executes");
		}
	}


	public static void main(String[] args) {
		System.out.println("Start");	
		  f1();

		  System.out.println("END");
		
	}
}