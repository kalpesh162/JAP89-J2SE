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

public class Example01{
	public static void main(String[] args) {
		String s1=new String("NoteBook");
		String s2=new String("NoteBook");
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