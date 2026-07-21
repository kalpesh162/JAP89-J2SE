// finally

public class Example03{
	public static void main(String[] args) {
		System.out.println("Hello");
		try{
			System.exit(1);
			System.out.println(11/0);
			System.out.println("Bye");

		}
		catch(Exception e){
			System.out.println("Exception Occured "+e);
		}
		finally{
			System.out.println("finally Block Executes");

		}

		System.out.println("END");
		
	}
}