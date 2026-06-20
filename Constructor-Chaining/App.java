
// this.
// this.method
// this()
class Data{
	int x; int y;

	Data(){
	//	this.f1();
		this(1,1);  // must be first statement of COnstructor
		//Data(1,1);// Error cannot find symbol
		System.out.println("Default");
	}
	Data(int x,int y){
		// 
		System.out.println("Parametrized");
	  this.x=x;
	  this.y=y;
	}

	void f1(){
		System.out.println("f1()");
	}
}

class App{
	public static void main(String[] args) {
		
		Data d1=new Data();
	}
}