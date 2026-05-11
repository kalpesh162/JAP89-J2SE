import java.util.Scanner;
class Day{
	public static void main(String[] args) {
		int dayNum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Day Num");
		dayNum=scanner.nextInt();
			int x=2;
		switch (dayNum) 
		{
			//case 2.2 : 
			//case value  :  "value must be constant"
			// constant
			// Integer Real Charcter
			// String Constant

			// case 'A' :   Its Allowed

			/*case x : 
			        System.out.println("WED..");break;
			*/
			        /*
				case x+2 : 
			        System.out.println("WED..");break;
			*/
			case 2+2 : 
			        System.out.println("WED..");break;
			// duplicate Case Label Not Allow
			case 4 : 
			        System.out.println("WED..");break;
			


			case 5 : 
			        System.out.println("THRUSDAY..");break;
			case 6 : 
			        System.out.println("FRI..");break;
			case 7 : 
			        System.out.println("SATDAY..");break;	

			default :
			      System.out.println("Invalid Day NUM..");break;	

			case 1 : 
			        System.out.println("SUNDAY..");break;
			case 2 : 
			        System.out.println("MONDAY..");break;
			case 3 : 
			        System.out.println("TUESDAY..");break;

		}

	}
}