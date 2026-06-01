class Bird{
	int cnt=0;
	static int count=0;   // Class Area | Method Area  | MetaSpace

	public Bird(){ cnt++ ; count++;}

}
class App{

	public static void main(String[] args) {
		
		Bird b1=new Bird();		
		Bird b2=new Bird();		
		Bird b3=new Bird();		

		System.out.println(b1.cnt);
		System.out.println(b1.count);
		System.out.println(b2.cnt);
		System.out.println(b2.count);
		System.out.println(b3.cnt);
		System.out.println(b3.count);

	}
}