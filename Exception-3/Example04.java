public class Example04{

	static void f1(){

		try{
			System.out.println("Inside try Block");
			System.out.println(11/0);
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