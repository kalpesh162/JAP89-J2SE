//Write a Java program to print all even numbers between 1 to 100. - using while loop
class PrintEven{
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
			 // i are you even then ->  i%2==0
			// if(cond)
			if(i%2==0){
			System.out.println(i);
			}
		}

		int j=1;
		while(j<=100){
			if(j%2==0){
			System.out.println(j);
			}
			  j++;
		}

	}
}