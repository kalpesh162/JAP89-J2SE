public class Example06{
	public static void main(String[] args) {
			
			Thread t1=new Thread();  // public void setPriority(int num)

			t1.setPriority(15);

			System.out.println("End");

	}
}

/*
public void setPriority(int num){
	   if(num>=1 && num<=10){

	   }
	   else{
	   	throw new IllegalArgumentException();
	   }
}
*/