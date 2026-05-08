import java.util.Scanner;
class LeapYear2{
	public static void main(String[] args) {
			int year;
			System.out.println("Enter Year");
			Scanner scanner=new Scanner(System.in);
			year=scanner.nextInt();
			if(year%400==0){
				System.out.println("LeapYear");
			}
			else{
				if(year%100!=0 && year%4==0)
					System.out.println("LeapYear");
				else{
					System.out.println("NOT LeapYear");
				}

			}
	}

}