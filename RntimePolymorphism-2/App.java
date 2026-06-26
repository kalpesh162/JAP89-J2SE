import java.util.Random;
class Shape{

	 void draw(){
	 	System.out.println("Shape Draw...");
	 };
	 void erase(){
	 	System.out.println("Shape Erase...");
	 };
}

class Circle extends Shape{
	@Override
	 void draw(){
	 	System.out.println("Circle Draw...");
	 };
	 @Override
	 void erase(){
	 	System.out.println("Circle Erase...");
	 };

}


class Triangle extends Shape{
	@Override
	 void draw(){
	 	System.out.println("Triangle Draw...");
	 };
	 @Override
	 void erase(){
	 	System.out.println("Triangle Erase...");
	 };

}


class Square extends Shape{
	@Override
	 void draw(){
	 	System.out.println("Square Draw...");
	 };
	 @Override
	 void erase(){
	 	System.out.println("Square Erase...");
	 };

}


class RandomeGeneratorShape{

	Random random=new Random();

	/*
	public Circle getCircle(){  return new Circle();}
	public Square getSquare(){  return new Square();}
	public Circle getTrinagle(){  return new Triangle();}
	public Circle getShape(){  return new Shape();}
	*/
	// UpCasting 
	public Shape getShape(){
		//Shape sh=null;
		int val=random.nextInt(3);
		//System.out.println(val);

		switch(val){
			case 0 :   return new Circle();
			case 1 :   return new Square();
			case 2 :   return new Triangle();
			case 3 :   return new Shape();

		}
		return null;
	}

}

public class App{

	public static void main(String[] args) {
			RandomeGeneratorShape generateShape=new RandomeGeneratorShape();
			//Triangle triangle=generateShape.getTrinagle();
			
			Shape shape=generateShape.getShape();

			shape.draw();
			shape.erase();
			
			//generateShape.getShape().draw();
			//generateShape.getShape().erase();
			Shape arr[]=new Shape[5];
			for(int i=0;i<arr.length;i++)
					arr[i]=generateShape.getShape();

			for(Shape sh:arr){
				sh.draw();
				sh.erase();
			}
		
	}
}