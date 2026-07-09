public class Sample04{
	public static void main(String[] args) {
		String text="Hum Dil De Chuke Sanam";
		System.out.println(text.startsWith("Hum"));
		System.out.println(text.startsWith("Hu"));
		System.out.println(text.startsWith("H "));
		System.out.println(text.endsWith("Sanam"));

		System.out.println(text.startsWith("Tum"));
		System.out.println(text.endsWith("Sanamawa"));
	
		//public boolean startsWith(String prefix)
		//public boolean endsWith(String suffix)
		System.out.println("----------------");
		String s1="";
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());


	}
}