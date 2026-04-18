class Example{
	
	public static void main(String[] args) {
		int base = 3;
		for(int i = 0; i < 3; i++) {
    		System.out.print((base *= ++base) + " ");
		}
		//12 156 24492
	}
}