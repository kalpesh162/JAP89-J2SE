public class Example2{
	public static void main(String[] args) {
			// ref type by default value is null
			String str=null;
			//Student s1=null;   s1.id
			try{
			System.out.println(str.length());        // new NullPointerException();
			}catch(Exception e){  // Generic Catch Block      Exception e=new NullPointerException();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		// How we can handle nullpointer exception without using try catch

		/*
		if(str != null)
			System.out.println(str.length());

		*/

		// Note
			/*
			try{

			}catch(Child ){

			}
			catch(){

			}catch(Parent){

			}
			*/



	}
}