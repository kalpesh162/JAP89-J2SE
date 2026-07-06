interface Instrument{
	int MAX=11;
	void play();	 // public abstract
}

abstract class A{
	 private void f1(){}
	  void f2(){}
	 protected void f3(){}
	 public void f4(){}
}

class Guitar implements Instrument{
	@Override
	public void play(){
		System.out.println("Guitar play");
	}
}
class Violin implements Instrument{
	@Override
	public void play(){
		System.out.println("Violin play");
	}
}
class Flute implements Instrument{
	@Override
	public void play(){
		System.out.println("Flute play");
	}
}

public class App{

	static void tune(Instrument i){
		 i.play();
	}
	public static void main(String[] args) {
		tune(new Guitar());
		tune(new Flute());
		tune(new Violin());
	}
}