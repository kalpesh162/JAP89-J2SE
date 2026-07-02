
class Engine{

	void start(){System.out.println("Start Engine");}
	void off(){}

}
class Window{

	void open(){System.out.println("Window Open");}
	void close(){}

}

class Wheel{
		public void inflate(int psi){

		}
}

class Car{
	private Engine engine=new Engine();
	private Window windows[]=new Window[2];
	private Wheel wheels[]=new Wheel[4];

	Car(){

		for(int i=0;i<windows.length;i++){
			 windows[i]=new Window();
		}

		for(int i=0;i<wheels.length;i++){
			 wheels[i]=new Wheel();
		}

	}

	public static void main(String[] args) {
			Car car1=new Car();

			System.out.println("Start ....");
			car1.engine.start();

			car1.windows[0].open();

	}
}