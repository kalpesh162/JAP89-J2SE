public class Example08{
	public static void main(String[] args) {
		try{
				System.out.println("Outside try");
				System.out.println(11/0);
					try{

					}
					finally{
						System.out.println("Inside Try finally ....");
					}
		}
		finally{
				System.out.println("Outside Try finally ....");	
		}
	}
}