class Example3{
	static void print(int n){
			if(n<5){
			print(n+1);
			System.out.println("Value "+n);
		}
			System.out.println("End "+ n);
	}
	public static void main(String[] args) {
			System.out.println("Start Main");
			print(1);	
			System.out.println("End Main");
	}
}