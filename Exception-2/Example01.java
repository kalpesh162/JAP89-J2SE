import java.io.File;
import java.io.IOException;
public class Example01{

	public static void f1() throws IOException,InterruptedException{
			f2();
	}
	public static void f2() throws IOException,InterruptedException{
			f3();
	}

	// we can throws mutiple Exception
	public static void f3() throws IOException,InterruptedException{
			File file=new File("apple.txt");
			file.createNewFile();

			Thread.sleep(1000);

			System.out.println("f3  End");

	}

	public static void main(String[] args)  throws IOException,InterruptedException{
			f1();
			System.out.println("Main  End");
	}
}