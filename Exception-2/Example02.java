import java.io.File;
import java.io.IOException;
public class Example02{

	public static void f1() throws Exception{
			f2();
	}
	public static void f2() throws Exception{
			f3();
	}

	// we can throws mutiple Exception
	// throws is keyword only apply with method
	// public void methodName() throws 
	public static void f3() throws Exception{
			File file=new File("apple.txt");
			file.createNewFile();

			Thread.sleep(1000);

			System.out.println("f3  End");

	}

	public static void main(String[] args)  throws Exception{
			f1();
			System.out.println("Main  End");
	}
}