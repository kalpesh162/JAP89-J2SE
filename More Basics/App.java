class App{
	public static void main(String[] args) {
			
			// break  
		// 1 Loop
		// 2 switch case
		for(int i=1;i<=100;i++){

			  if(i==50)
			  	break;

			  System.out.println(i);

		}

		for(int i=1;i<=100;i++){
			if(i==50)
				continue;

			System.out.println(i);
		}

		System.out.println("----------------");
		//do while
		int x=15;
		do{
			System.out.println(x);
			x++;

		}while(x<5);

		// Menu Driven Program

	}
}