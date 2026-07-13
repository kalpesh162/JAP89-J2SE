public class Example05{
	public static void main(String[] args) {

		// Constant Computation done at Compile time
		int y=3+4;
		// Computatation done at runtime
		int x=5;
		int a=5+x;

		String s1="KareenaKapoor";

		String s3="Kareena"+"Kapoor"; // this ex[pression] computes at conpile time

		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

		System.out.println("---------------------------");		

	}
}
// String are constant

//String s3="Kareena"+"Kapoor";
//new StringBuilder().append().append().toString();