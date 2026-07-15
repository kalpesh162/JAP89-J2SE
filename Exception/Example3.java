public class Example3{
	public static void main(String[] args) {
		String str=null;
		String num="111A1";
		// int x=111;  Integer i=new Integer(x);
		// String val=String.valueOf(x);
		try{
		//System.out.println(str.length());
		int number=Integer.parseInt(num);  // UnBoxing
		System.out.println(number);
	}catch(NullPointerException e){
		System.out.println(e);
		System.out.println(e.getMessage());

	}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println(e.getMessage());
	}

	System.out.println("END");

	}
}