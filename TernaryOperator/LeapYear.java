import java.util.Scanner;
class LeapYear{
	public static void main(String[] args) {
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Year ");
		year=scanner.nextInt();

		// year%400==0 || year%100!=0 && year%4==0
		String message=(year%400==0 || year%100!=0 && year%4==0) ? "LeapYear " : "Not LeapYear";
		
		System.out.println(message);

	}
}