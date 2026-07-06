
abstract class Cycle{
	int wheels=0;
	public abstract void ride();
	Cycle(int wheels){ this.wheels=wheels;}

	// non-abstarct
	int showNoWheels(){ return wheels;}
	
}
class UniCycle extends Cycle{

	UniCycle(int n){
		 wheels=n;
	}
	@Override
	public void ride(){

	}
}
class BiCycle extends Cycle{
	BiCycle(int n){
		 wheels=n;
	}
	@Override
	public void ride(){

	}
}

class TriCycle extends Cycle{
	TriCycle(int n){
		 wheels=n;
	}
	@Override
	public void ride(){

	}
}

public class CycleTest{
	public static void main(String[] args) {
		
	}
}