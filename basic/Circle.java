// Write a  program to enter the radius of a circle and find its diameter, circumference and area.
class Circle{

		public static void  main(String a[]){

			int radius=6;
			//float radius=6.6f;


			int diameter=2*radius;

			//int circumference=2*3.14*radius;
			//float circumference=2*3.14*radius;
			double circumference=2*3.14*radius;

			double area=3.14*radius*radius;

			System.out.print("radius  ");
			System.out.println(radius);
			System.out.print("diameter  ");
			System.out.println(diameter);
			
			System.out.print("circumference  ");
			System.out.println(circumference);

			System.out.print("area  ");
			System.out.println(area);
			
			




		}

}