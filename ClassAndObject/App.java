// class consist of fields and methods
// class is a logical entity
// class doesnt gets any space
class Box{
	// Fields
	// memeber Fields
	// instance Fields
	int len;
	double width;
	float ht;
	// Behaviour
	// Method | Fuction
	// memeber Function
	// instance Method
	double getVolumeOfBox(){
		return len*width*ht;
	}	
}
class App{
	public static void main(String[] args) {
		// How To Create an Object
		// Type t1=new Type();
		Box b1=new Box();
		// new is used to create DMA[Dynamic Memory Allocation]

		System.out.println("Len "+b1.len);
		System.out.println("width "+b1.width);
		System.out.println("Ht "+b1.ht);

		double res=b1.getVolumeOfBox();
		System.out.println(res);

		b1.len=5;
		b1.width=6.6;
		b1.ht=5.7f;
	
		double res1=b1.getVolumeOfBox();
		System.out.println(res1);
				
	}
}