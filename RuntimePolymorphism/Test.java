/*
class java.lang.Object{
	 public String toString(){
	 	 return this.getClass()+"@"+hashcode();
	 }
	 public int hashcode(){
		return ;
	 }
}
*/

class Point{
	 private int x;
	 private int y;
	 Point(int x,int y){
	 	this.x=x;
	 	this.y=y;
	 }

	 // setter
	 // getter

	 @Override
	 public String toString(){
	 		return "X "+x+"  Y: "+y;
	 }


}


class Test{
	public static void main(String[] args) {
			Point p1=new Point(11,22);
			//System.out.println(p1.x)
			//System.out.println(p1.getX())	

			System.out.println(p1); //Point@4617c264
			//Point@4617c264
			/// className @ hashcode

			// Why ? Object --> String   internally toString()
			// we are printing  p1 internally java call toString method 
			//
	}
}