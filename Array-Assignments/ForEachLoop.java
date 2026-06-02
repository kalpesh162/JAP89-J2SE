

// This Example demostarte for each loop in java
class ForEachLoop{
	public static void main(String[] args) {
		
		int arr[]={11,22,33,44,55};

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");

		System.out.println();
		System.out.println("----------");
		// for each
		for( int x: arr)
			System.out.print(x+"  ");

		System.out.println("-----------------");
		System.out.println();

		for(int i=0;i<arr.length;i++)
			arr[i]=arr[i]*10;

		// 110 220 330 440 550
		for( int x: arr)
			System.out.print(x+"  ");
		System.out.println();

	System.out.println("-----------------");

		for(int y:arr)
			 y=y*10;  //// 1100 2200 3300 4400 5500

	System.out.println("-----------------");
		for( int x: arr)
			System.out.print(x+"  ");
		System.out.println();

	System.out.println("-----------------");

	}
}

// Singleton Design Pattern

// for(int i=0;i<arr.length;i++) here programmer cntrolls the index
// for( int x: arr) java internally manage this
//for( int x: arr)   internally java uses Iterator Design Pattern
