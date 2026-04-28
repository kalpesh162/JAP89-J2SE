import java.util.Scanner;
class Table{
	public static void main(String[] args) {
			
			int num;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Table Num  ");
			num=scanner.nextInt();

			for(int i=1;i<=10;i++){
				//System.out.println(num*i);
				// 5 *  1  = 5
				// num *  i = num*i
				/*
				System.out.print(num);
				System.out.print(" * ");
				System.out.print(i);
				System.out.print("  =  ");
				System.out.println(num*i);
				*/
				//System.out.println(num +" * "+ i +"  =  "+(num*i));
				// %d 
				//System.out.printf("%d * %d = %d \n",num,i,(num*i));
				System.out.printf("%4d * %3d = %4d \n",num,i,(num*i));


			}
	}
}