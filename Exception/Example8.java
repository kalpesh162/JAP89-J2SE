
import java.io.IOException;
import java.io.File;
public class Example8{

	public static void f1() throws IOException{
			f2();
	}
	public static void f2() throws IOException{
		  f3();
	}
	public static void f3() throws IOException{
		File file=new File("hello.txt");		
			file.createNewFile();
	}
	public static void main(String[] args) throws IOException {
				f1();
				System.out.println("END");
	}
}