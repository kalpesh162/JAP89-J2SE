class Example5{
	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<=n;i++){
			// SPACE LOOP
			for(int sp=i;sp<n;sp++)
				System.out.print(" ");

			// STAR LOOP
	 		for(int j=1;j<=i;j++){
	   			//System.out.print("*");
	   			//System.out.print(i);
	   			System.out.print(j);
	 		}
		  
		  System.out.println();
	
	}
		
	}
}

/*
i=2

for(int sp=i;sp<n;sp++)
		System.out.print(" ");

	sp=2 sp<n

   2<5 " "
   3<5 " "
   4<5 " " 

 */