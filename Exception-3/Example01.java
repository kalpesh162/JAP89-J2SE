// finally

public class Example01{
	public static void main(String[] args) {
		System.out.println("Hello");
		try{

			System.out.println(11/0);
			System.out.println("Bye");

		}
		finally{
			System.out.println("finally Block Executes");

		}

		System.out.println("END");
		
	}
}