import java.util.Scanner;
class Calculator{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double num1,num2,res;
		char choice,letter;
	do{
		System.out.println("Enter Num1 ");
		num1=scanner.nextDouble();
		System.out.println("Enter Num2 ");
		num2=scanner.nextDouble();

		System.out.println("**** MENU ****");
		System.out.println("  + ");
		System.out.println("  - ");
		System.out.println("  * ");
		System.out.println("  / ");
		System.out.println("Enter Op Symbol");
		choice=scanner.next().charAt(0);

		switch(choice){

			case '+' :  res=num1+num2;  
						System.out.print(" NUM 1 = "+num1);
						System.out.print("  NUM 2 = "+num2);
						//System.out.println(" =  "+res);
						System.out.printf("  %.2f \n",res); 
						break;
			case '-' :
						res=num1-num2;  
						System.out.print(" NUM 1 = "+num1);
						System.out.print("  NUM 2 = "+num2);
						//System.out.println(" =  "+res);
						System.out.printf("   %.2f \n",res); 
						break;
			case '*' :
						res=num1*num2;  
						System.out.print(" NUM 1 = "+num1);
						System.out.print("  NUM 2 = "+num2);
						//System.out.println(" =  "+res);
						System.out.printf("   %.2f \n",res); 
						break;
			case '/' :
						res=num1/num2;  
						System.out.print(" NUM 1 = "+num1);
						System.out.print("  NUM 2 = "+num2);
						//System.out.println(" =  "+res);
						System.out.printf("    %.2f \n",res); 
						break;
			default :
					System.out.println("Enter Valid Input");
					break;
		}

		System.out.println("DO YOU WANT TO CONTINUE ,,, Y or y");
		letter=scanner.next().charAt(0);
     }while(letter=='Y' || letter=='y');

     System.out.println("***** END ****** ");
	}
}