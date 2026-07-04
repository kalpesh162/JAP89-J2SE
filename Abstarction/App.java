// if class has abstract method then we must have to make class as abstract
abstract class Instrument{
	// when the methos is logically incomplete then we declare that method as abstract
	// abstract method dont have body
	 abstract void play();

	// non-abstarct method
	void adjust(){
		System.out.println("adjust :: Instrument");
	}
}

class Guitar extends Instrument{
	@Override
	void play(){
		System.out.println("Guitar Play...");
	}
	@Override
	void adjust(){
		System.out.println("adjust :: Guitar");
	}

}


class Flute extends Instrument{

	@Override
	void play(){
		System.out.println("Flute Play ...");
	}

}


class Violin extends Instrument{

	@Override
	void play(){
		System.out.println("Violin Play ...");
	}

}
/*
abstract class Guitar extends Instrument{
	
}

*/
/*
abstract class Hello{

	// Note if class is abstract then there is no compulsion of abstract method
	// it can or cant be

	void f1(){

	}
	void f2(){
		
	}

}
// Java dont allow to create Object Of Abstract class
*/
class App{

	static void tune(Instrument i){
		i.play();
		i.adjust();
	}


	public static void main(String[] args) {
			//Instrument i1=new Instrument(); // Instrument is abstract; cannot be instantiated

		Instrument i1=new Guitar();
		i1.play();

		tune(new Guitar());
		tune(new Flute());
		tune(new Violin());

	}
}