class A{
	int x;
	A(){
		int y=x;
		x=11;
	}
	A(int x){
		
		this.x=x;
	}

}
/*
class A{
	int x=11;
	A(){
		int y=x;
		x=11;
	}
	A(int x){
		
		this.x=x;
	}

}
*/
class App{
	public static void main(String[] args) {
		
		// num got memory in Stack Area
		final int num=11;  //cannot assign a value to final variable num
		//num=22;

		// Local fields must be intialized
		final int x;

		int y;

		// I m using unitialized variable
	//	System.out.println(x);
	//	System.out.println(y);

		// I m using unitialized variable
		String name;  
		//System.out.println(name);
		// I m using unitialized variable
		A a1=null; //  A a1=new A();
		System.out.println(a1);

	}
}