public class Example04{
	public static void main(String[] args) {
		String s1="Kareena";
		String s2=s1.concat("Kapoor").intern();
		String s3="KareenaKapoor";

		if(s2==s3){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}

		System.out.println("----------");

		if(s2.equals(s3)){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}

	}
}