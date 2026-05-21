// Object will be created if there is a constructor
// Without constructor no Object creation

// What is Constructor? 
// special method which has same name as that of class
class Rock{
  // Default Constructor   | ParameterLess Constructor  | no-arg Constructor
  Rock(){
  	System.out.println("Default Constructor");
  }

  // parameterized Constructor | argument Constructor
  Rock(int x){
	System.out.println("parameterized Constructor");
  }

}

class App{
	public static void main(String[] args) {
			Rock r1=new Rock();	
			Rock r2=new Rock(11);	
//			Rock r3=new Rock(11,22);	
	}
}