public  class Circle{
	double radius=1.0;
	String color="red";

	Circle(){}
	Circle(double r){radius=r;}
	Circle(double r,String col){radius=r; color=col;}

	double getRadius() { return radius;}
	String getColor() { return color;}

	double getArea(){ return 3.14*radius*radius;}

}