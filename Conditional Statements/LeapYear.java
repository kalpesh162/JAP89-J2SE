import java.util.Scanner;
class LeapYear{
	public static void main(String[] args) {
			int year;
			System.out.println("Enter Year");
			Scanner scanner=new Scanner(System.in);
			year=scanner.nextInt();
			// 400    600  2004
			// 500  2004  2005
			if(year % 400 ==0){
				System.out.println("Its Century LeapYear...");
			}
			else if(year %100 ==0 ){
				System.out.println("Its Century NOT LeapYear...");	
			}
			else if(year%4==0){
				System.out.println("Its  LeapYear...");
			}
			else{
				System.out.println("Its  NOT LeapYear...");	
			}

	}
}