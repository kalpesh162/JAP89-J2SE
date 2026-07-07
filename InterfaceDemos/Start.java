// interface Callable Serilzable Runnable 

interface CanFly{
	void fly();
}
interface CanSwim{
	void swim();
}
interface CanFight{
	void fight();
}

class ActionHero implements CanFight{
	@Override
	public void fight(){
		System.out.println("ActionHero :: fight");
	}
}

// Multiple Inheritance
class Hero extends ActionHero implements CanSwim,CanFly{
	@Override
	public void swim(){

	}
	@Override
	public void fly(){

	}

}


class Start{

	static void  t(CanSwim c1){
		c1.swim();
	}
	static void  u(CanFly c1){
		c1.fly();
	}
	static void  v(CanFight c1){
		c1.fight();
	}

	public static void main(String[] args) {
		t(new Hero());
		v(new Hero());

	}
}
	
