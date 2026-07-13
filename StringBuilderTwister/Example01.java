/*
class Object{
	 public boolean equals(Object ob){
	 	 if(this==ob) return true;

	 	 return false;
	 }
}
class StringBuilder extends Object{

}
*/
public class Example01{
	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Kareena");
		StringBuilder sb2=new StringBuilder("Kareena");

		System.out.println(sb1==sb2);
		// StringBuilder doent overides equals and hashcode method
		System.out.println(sb1.equals(sb2));

	}
}