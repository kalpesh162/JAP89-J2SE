class Bird{
	int cnt=0;
	static int count=0;   // Class Area | Method Area  | MetaSpace

	public Bird(){ cnt++ ; count++;}

}
class App{

	public static void main(String[] args) {
		
		Bird b1=new Bird();		
		
		System.out.println(b1.cnt);  // What is type of b1 --> Bird
		   							 //  b1.cnt   --> is there a fiedl in the Bird class as cnt 

		System.out.println(b1.count);
		  							//  What is type of b1 --> Bird
									// b1.count
									//  is count is static  the convert to b1--> Bird.count
		Bird b2=new Bird();		
	

		System.out.println(b2.cnt);
		System.out.println(b2.count);
		Bird b3=new Bird();		

		System.out.println(b3.cnt);
		System.out.println(b3.count);

		// Can Static field called on object (reference)
		//System.out.println(b3.count);  Called On ref 
		// Static Field should be called on className
		System.out.println(Bird.count);


	}
}