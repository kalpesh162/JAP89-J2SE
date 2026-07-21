public class Example09{
	public static void main(String[] args) {
		try{
				System.out.println("Outside try");
				
					try{
						System.out.println(" try Inside try");
						System.out.println(11/0);	
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