class Animal{
	 // fields
	 // methods
	void eat(){
		System.out.println("Eating ...");
	}
}
class Bird extends Animal{
	void fly(){
		System.out.println("Flying Bird...");
	}

}
public class App{
	public static void main(String[] args) {
		//	Animal animal=new Animal();
		//	animal.eat();

			Bird bird=new Bird();
			bird.eat();
			bird.fly();
	}	
}
