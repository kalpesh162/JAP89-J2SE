public  class App{
	public static void main(String[] args) {
	
		// Ask is this Object Creates
		// Yes 
		Watch titan=new Watch();
		System.out.println("------------------");
		//System.out.println(titan.hr);
		//System.out.println(titan.min);
		//System.out.println(titan.sec);
		titan.setHr(12);
		System.out.println(titan.getHr());  
		titan.displayWatch();



		System.out.println("------------------");
		Watch rolex=new Watch(11,22,33);
		System.out.println("------------------");
		//System.out.println(rolex.hr);
		//System.out.println(rolex.min);
		//System.out.println(rolex.sec);

		rolex.displayWatch();



	}
}