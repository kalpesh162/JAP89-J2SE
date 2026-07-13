public class Example04{
	public static void main(String[] args) {
		String s1="KareenaKapoor";
		String s2="Kareena";
		String s3=s2.concat("Kapoor").intern();

		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

		System.out.println("---------------------------");		

	}
}