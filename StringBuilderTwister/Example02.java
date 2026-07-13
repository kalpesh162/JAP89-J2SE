public class Example02{
	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Kareena");
		String sb2=new String("Kareena");

		
		// StringBuilder doent overides equals and hashcode method
		// String class overrides equals and hashcode

		System.out.println(sb2.equals(sb1));
		System.out.println(sb1.equals(sb2));

		// error: incomparable types: StringBuilder and String
		System.out.println(sb1==sb2);


	}
}