/*
Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
    For unit above 250 Rs. 1.50/unit
    An additional surcharge of 20% is added to the bill
*/
import java.util.Scanner;
class ElectricityBillNEW{
	public static void main(String[] args) {
		int noOfUnits;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter NO OF UNITS....");
		noOfUnits=scanner.nextInt();
		double bill=0;
		if(noOfUnits<=50){                       //   1 -- 50
			bill=bill+noOfUnits*0.5;
		}
		else if(noOfUnits>50 && noOfUnits<=150)   //  51  --- 150
		{
			bill=50*0.5+(noOfUnits-50)*0.75;
			
		}
		else if(noOfUnits>150 && noOfUnits<=250)  // 151  ----  250{

				bill=50*0.5+100*0.75+(noOfUnits-150)*1.2;
		}		
		else{
			bill=50*0.5+100*0.75+250*1.2+(noOfUnits-250)*1.5;
		}

		double totalBill=bill+bill*0.2;

		System.out.println("total Bill  "+totalBill +" RS");


	}
}