abstract class A{
	//illegal combination of modifiers: abstract and final
	//final abstract void f1();
	// illegal combination of modifiers: abstract and static
	//static abstract void f1();
	// modifier static not allowed here
	// Can we make constructor static 
	//static public A(){
     // constructor job to intialize instance fields
	   /*
			   + if we make constructor as static then it only access static members

		Not constructor initialize instance fields

		SO Can be static

		+ constructor job is suppose to do the initialization
		initialization is done after Object Creation

		While static gets Memory at the time of class Loading 

	 */
	//}
	// error: modifier final not allowed here
	  /*final public A(){
	  	// constructor can not be inherite so applying final modifier to Consumer
	  	// is meanigless

	  }
	  */

}

abstract class B{

	void f1(){
		System.out.println("B :: f1()");
	}
}

class Sample{
	
	public static void main(String[] args) {
		
	}
}