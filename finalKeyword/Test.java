class Point{
	// instance Fields
	  final int x;
	  final int y;
	  {

	  }
	  
	  Point(){
	  	x=11; y=22;
	  
	   }
	   
	  
	  Point(int x,int y){
	  	this.x=x;
	  	this.y=y;
	  }
/*
	  double distance(Point p2){
	  		p2=new Point(0,0);
	  	// this.x  p2.x	
	  	return 5.5;
	  }
*/

	  	// final as parameter
		  double distance(final Point p2){
	  		//p2=new Point(0,0);
	  	// this.x  p2.x	
	  	return 5.5;
	  }
  

}

class Test{
	public static void main(String[] args) {
		Point p1=new Point();
		System.out.println(p1.x);
		System.out.println(p1.y);

		// Actual Object is not final
		// Hrere ref is final
		final Point p2=new Point(10,20);
		System.out.println(p2.x);
		System.out.println(p2.y);

		Point p3=new Point(33,44);

		//p2=p3; //  cannot assign a value to final variable p2 p2=p3;

		double magnitude=p1.distance(p2);
	}

}