
// public String concat(String s)
class Sample01{
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str);
		//public char charAt(int index){ }
		// public int length()
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}

		// String --- char[]
		// public char[] toCharArray()
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

		//public String toUpperCase(){}
		System.out.println("UpperCase  "+str.toUpperCase());
		System.out.println("LowerCase  "+str.toLowerCase());

	}
}