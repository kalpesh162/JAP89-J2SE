
class Point{
	int x=10;
	int y=20;

	static{
		System.out.println("static Block");
	}

	Point(int x,int y){
		 this.x=x;
		 this.y=y;
	}

}

class App{
	public static void main(String[] args) {
			Point p1=new Point(11,22);

			System.out.println("((((()))))))");
	}
}

// App.java    ---> App.class Point.class

// java App   --> App.class  At the time of classLoading static gets Memory
// main method is static in App class
// so first main method gets space in class Area


// Point p1=new Point(11,22);

// Point.class At the time of classLoading static gets Memory
// static block gets executes

