/*
class Object{
	 public boolean equals(Object ob){

	 } 
}

public class String{
	@Override
	public boolean equals(Object ob){
	 	
	 }
}
*/

public class Example02{
	public static void main(String[] args) {
		String s1="NoteBook";
		String s2="NoteBook";
		// compareTo  contentEquals
		// ==
		// equals
		// equals actually from Object 
		// String class overrides that method and provide implemetation 
		// how two String objects content same or not
		System.out.println(s1.equals(s2));

		// ==
		// int x=5;  int y=5;    x==y

		System.out.println(s1==s2);		

	}
}