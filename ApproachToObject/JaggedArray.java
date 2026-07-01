import java.util.Scanner;
class JaggedArray{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int rows,columns;
		System.out.println("Enter No Of Benches");
		rows=scanner.nextInt();

		// create 2-D Array
		int benches[][]=new int[rows][];

		for(int i=0;i<benches.length;i++){
			System.out.println("Enter No Of sitting arrangement in that bench No "+(i+1));
			columns=scanner.nextInt();			
			benches[i]=new int[columns];
		}
		System.out.println("------------------------------");
		for(int i=0;i<benches.length;i++){
			 for(int j=0;j<benches[i].length;j++){
			 	System.out.println("Enter Value" +"  "+i+""+j);
			 	benches[i][j]=scanner.nextInt();
			 }
			 System.out.println();
		}


		System.out.println("------------------------------");
		for(int i=0;i<benches.length;i++){
			 for(int j=0;j<benches[i].length;j++)
			 	System.out.print(""+i+ " "+ j+ ""+benches[i][j]+"  ");
			 System.out.println();
		}

		
	}
}