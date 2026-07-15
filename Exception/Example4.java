
// CODE has Compile Time Error
/*
Example4.java:17: error: exception NullPointerException has already been caught
        catch(NullPointerException e){
        ^
Example4.java:21: error: exception NumberFormatException has already been caught
        }catch(NumberFormatException e){
         ^
*/

public class Example4{
	public static void main(String[] args) {
		String str=null;
		String num="111A1";
		// int x=111;  Integer i=new Integer(x);
		// String val=String.valueOf(x);
		try{
		//System.out.println(str.length());
		int number=Integer.parseInt(num);  // UnBoxing  new NumberFormatException("For input string :"+num);
		System.out.println(number);
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.println(e.getMessage());

	}
	catch(NullPointerException e){
		System.out.println(e);
		System.out.println(e.getMessage());

	}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println(e.getMessage());
	}


	System.out.println("END");

	}
}