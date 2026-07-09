public class Sample03{
	public static void main(String[] args) {
		//int	codePointAt(int index)

		//String	replaceFirst(String regex, String replacement)	
		String msg="Hello How are U ? Hello ";
		//Hi How are U ? Hello
		System.out.println(msg.replaceFirst("Hello","Hi"));	
		System.out.println(msg.replaceFirst("H","T"));	

		String str="ABCD";
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i)+"  "+str.codePointAt(i));
		
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i)+" "+ (int)str.charAt(i));

		//static String	copyValueOf(char[] data)

		char arr[]={'A','B','C'};
		String s1=new String(arr);

		String s2=String.copyValueOf(arr);	
		String s3=String.valueOf(arr);
/*
		// incompatible types: char[] cannot be converted to String
		String s4=(String)arr;
		System.out.println(s4);
*/

	}
}