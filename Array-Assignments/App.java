import java.util.Random;
class App{
	public static void main(String[] args) {
		Random random=new Random();

		for(int i=1;i<=10;i++){
			System.out.println(random.nextInt());
		}
	}
}