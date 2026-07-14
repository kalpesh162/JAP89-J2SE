 // Exception is an event or situation where program gets terminate abnormally
 // In order to handle exception java provides Exception Handling technieque
// Exception Handling --> Conveting abnormal termination to normal termination

// try   --> try block  --> we write error code (risky code)
// catch --> Handle that (proper type)
// throws
// throw
// finally


// This code leads to abnormal termination
 class App{
	public static void f1(){
		System.out.println("IN F1");
		f2();
		//..
		System.out.println("END F1");
	}
	public static void f2(){
		System.out.println("IN F2");
		f3();
		//...
		System.out.println("END F2");
	}
	public static void f3(){
		System.out.println("IN F3");

		int x=11; int y=0;
		System.out.println(x/y);

		System.out.println("END F3");
	}

	public static void main(String[] args) {
		System.out.println("IN Main");
			f1();
			//..
		System.out.println("END Main");
	}
}
