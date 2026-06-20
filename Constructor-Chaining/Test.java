// 
class PData{
	PData(int m){
		System.out.println("PData Default");
	}
}

class Data extends PData{
	int x; int y;
	Data(){
		//super(10);
		//this.f1();
		this(1,1);  // must be first statement of COnstructor
		//Data(1,1);// Error cannot find symbol
		System.out.println("Default");
	}

	Data(int x,int y){
		super(10);
		System.out.println("Parametrized");
	  this.x=x;
	  this.y=y;
	}

	void f1(){
		System.out.println("f1()");
	}
}

class Test{
	public static void main(String[] args) {
		
		Data d1=new Data();
	}
}