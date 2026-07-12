class Example02{
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		System.out.println("  capacity  "+sb.capacity());
		sb.append("Raveena");
		System.out.println("  capacity  "+sb.capacity());
		System.out.println("------------------");
		StringBuilder sb1=new StringBuilder("Madhuri");  // 23
		sb1.append("Akashay");
		System.out.println("  capacity  "+sb1.capacity());
		sb1.append("1234567890");  // beyound 23   24th letter
		System.out.println("  capacity  "+sb1.capacity());


	}
}