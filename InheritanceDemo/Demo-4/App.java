
class Art{
	int x;

	static{
		System.out.println("Static Block Art");
	}

	// Instace Fields
	{
	System.out.println("Instance Block");
	x=10;	
	}

	Art(){
		super();
		x=20;
		System.out.println("Art Construcor");
	}

}

class Drawing extends Art{
	double y;

	static{
		System.out.println("Static Block Drawing");
	}

	Drawing(){
		super();
		System.out.println("Drawing Construcor");
	}

}

class Cartoon extends Drawing{
	char z;

	static{
		System.out.println("Static Block Cartoon");
	}
	
	Cartoon(){
		super();
		System.out.println("Cartoon Construcor");
	}

}


public class App{

static{
		System.out.println("Static Block App");
	}

	public static void main(String[] args) {

		//Cartoon tomAndJerry=new Cartoon();
		Art art=new Art();

	//	Drawing draw=new Drawing();


	//	Cartoon cartoon=new Cartoon();

	//Art art=new Art();	
	

	}
}