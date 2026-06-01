
class Data{
	int x=10;
	static int y=20;

	// instance Method can access both static as well as instance fields as well methods
	void printData(){
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}

	// static method can access only static fields and method
	static void printInfo(){
		// can not use this
		System.out.println("y : "+y);
		System.out.println("x : "+x);	
	}
}

class App{
	public static void main(String[] args) {

//		System.out.println(Data.y);
		Data d1=new Data();
		d1.printData();  //d1.printData((Data)this);

		d1.printInfo(); // Data.printInfo();

		Data.printInfo();
		
	}
}