public class Sample02{
	public static void main(String[] args) {
		String movie="Hum Dil de Chuke Sanam";

		// public boolean contains(CharSequence)
		System.out.println(movie.contains("Dil"));
		System.out.println(movie.contains("D"));
		/*
		boolean	contentEquals(CharSequence cs)	
		boolean	contentEquals(StringBuffer sb)
		*/
		String str1="Hello World";
		String str2="World";
		System.out.println("===> "+str1.contains(str2));
		System.out.println("===> "+str1.contentEquals(str2));

		String str3="Hello World";
		System.out.println("===> "+str1.contentEquals(str3));

		System.out.println("-----------------------");
		StringBuffer sb=new StringBuffer("Hello World");
		System.out.println("===> "+str1.contentEquals(sb));






	}
}