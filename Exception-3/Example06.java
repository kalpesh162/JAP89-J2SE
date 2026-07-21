public class Example06{

	static int f1(){
		int x=11;
		try{
			System.out.println("Inside try Block");
			return x;
		}
		finally{
			System.out.println("finally Block Executes");
		}
		//return (x+11);
	}
	public static void main(String[] args) {
		System.out.println("Start");	
		  
		  System.out.println("  f1()  "+f1());

		  System.out.println("END");
		
	}
}

/*
Start
Inside try Block
finally Block Executes
  f1()  11
END
*/