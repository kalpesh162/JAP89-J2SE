class Example4{
	static void print(int n){
			System.out.println("1 : "+n);
			if(n<3){
			print(n+1);
			print(n+2);
			}
			System.out.println("2 : "+ n);
	}
	public static void main(String[] args) {
			System.out.println("Start Main");
			print(1);	
			System.out.println("End Main");
	}
}

