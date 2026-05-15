class Example2{

	static void print(int n){
			System.out.println("Start "+ n);
			print(n-1);
			System.out.println("End "+ n);
	}

	public static void main(String[] args) {
			System.out.println("Start Main");
			print(10);	
			System.out.println("End Main");
	}
}