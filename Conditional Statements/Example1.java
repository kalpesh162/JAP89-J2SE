import java.util.Scanner;
class Example1{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);		
		System.out.println("Enter Number");

		num=scanner.nextInt();

		// num>0   num<0  num==0
		if(num>0)
			System.out.println("POS Number "+num);

		if(num<0)
			System.out.println("NEG Number "+num);

		if(num==0)
		System.out.println("ZERO Number "+num);

		System.out.println("-----------------------");

		if(num>0)
			System.out.println("POS Number "+num);
		else
			System.out.println("NEG Number "+num);

		if(num==0)
		System.out.println("ZERO Number "+num);

			System.out.println("-----------------------");

		if(num>0){
			System.out.println("POS Number "+num);
		}
		else{
			if(num<0)
				System.out.println("NEG Number "+num);
			else
				System.out.println("POS Number "+num);
		}

					System.out.println("-----------------------");

		if(num>0){
			System.out.println("POS Number "+num);
		}
		else if(num<0)
				System.out.println("NEG Number "+num);
		else
				System.out.println("POS Number "+num);
		

	}
}