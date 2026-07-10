/*
public interface Comparable<String>{
	 int compareTo(String s)
}
*/

public class Sample01{

	//public int compareTo(String )  
	// return  0  
	// return  +ve
	// return  -ve 

	public static void main(String[] args) {
			String s1="Apple";
			String s2="Apple";
			String s3="apple";

			System.out.println(s1.compareTo(s2));
			System.out.println(s1.compareTo(s3));  // 'A'-'a'	

			String s4="Hello";
			String s5="Cello";
			System.out.println(s4.compareTo(s5));  // 'H'-'C'	

			// int	compareToIgnoreCase(String str)
			System.out.println(s1.compareToIgnoreCase(s3));

			String s6="ABC";
			String s7="ABCD";
			System.out.println("--->  "+s6.compareTo(s7)); //-1

			String str1="latur";
			String str2="pawan";   
			System.out.println("--->  "+str1.compareTo(str2));  // l-p







	}
}