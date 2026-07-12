class Example03{
	public static void main(String[] args) {
		// int	codePointAt(int index)
		StringBuilder sb=new StringBuilder("Kareena");
		System.out.println(sb.codePointAt(0));
		//int	indexOf(String str)
		StringBuilder sb1=new StringBuilder("Hello I Love India Hello I Love India");
		System.out.println("indexOf  "+sb1.indexOf("Love"));  // first Occurrance
		System.out.println("indexOf  "+sb1.indexOf("Love",9));
		System.out.println("indexOf  "+sb1.lastIndexOf("Love"));  // lastOcurrance

		// character --> String "H"
		// mutable
		StringBuilder sb2=new StringBuilder("mobile");
		System.out.println(sb2.reverse());
		System.out.println(sb2);

		System.out.println("----------");

	}

}