class Sample02{
	public static void main(String[] args) {
		String movie="Hum Apke Hai Kaun";
		// public String replace(char old,char newOne)
		System.out.println(movie.replace('H','T'));
		
		/*
		replaceFirst needs regularExpression

		//String	replaceFirst(String regex, String replacement)
		System.out.println(movie.replace("H","T"));

		//String	replaceFirst(String regex, String replacement)	
		String msg="Hello How are U ? Hello ";
		System.out.println(msg.replace("Hello","Hi"));	
		*/
		// firsOccurance
		System.out.println("index of 'A' "+movie.indexOf('A'));
		System.out.println("index of 'A' "+movie.lastIndexOf('H'));

		String msg="Hello How are U ? Hello ";

		System.out.println("index Of 'Hello '"+msg.indexOf("Hello"));
		System.out.println("index Of 'Hello '"+msg.lastIndexOf("Hello"));


	}
}