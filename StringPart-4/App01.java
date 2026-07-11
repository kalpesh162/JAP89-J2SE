/* public class java.lang.Object{
	 
	  public boolean equals(Object ob){

	  	if(this==ob) return true;
	 	else
	 	return false;
	  }
}

*/

class Point{
	int x;
	int y;
	Point(int x,int y){ this.x=x; this.y=y;}

	@Override            // Object ob=p2;  p2 is Point  Why Object Parent Class Point is subclass
	public boolean equals(Object ob){

		 // typecasting
		Point p2=(Point)ob;

		if(this.x==p2.x && this.y==p2.y) return true;

		return false;
	}
}

class App01{
	public static void main(String[] args) {

		Point p1=new Point(11,22);
		Point p2=new Point(11,22);
		
		if(p1==p2){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}

		// In this Example equals method actually calls from Object
		if(p1.equals(p2)){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}

	}
}