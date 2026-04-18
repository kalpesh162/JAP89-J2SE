//1  2  3  4  5
//1  2  3  4  5
//1  2  3  4  5
//1  2  3  4  5
//1  2  3  4  5
//___________________
/*
1 1 1 1 1 
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

 1   1   1   1   1 
11  12  13  14  15
21  22  23  24  25
 3
31  32  33  34  35
41  42  43  44  45
51  52  53  54  55
*/



class Example1{
	public static void main(String[] args) {

System.out.println("--------------1-------------");		
		for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			//System.out.print(i +""+j+"  ");
			System.out.print("*"); 
		}
		System.out.println();
	}

		System.out.println("------------2---------------");
		for(int i=1;i<=5;i++){
			for(int j=5;j>=1;j--){
				//System.out.print(i +""+j+"  ");
				System.out.print("*"); 
			}
			System.out.println();
		}
		System.out.println("------------3---------------");
		for(int i=5;i>=1;i--){
			for(int j=5;j>=1;j--){
				//System.out.print(i +""+j+"  ");
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		System.out.println("------------4---------------");
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++){
				//System.out.print(i +""+j+"  ");
				System.out.print("*"); 
			}
			System.out.println();
		}

	}
}