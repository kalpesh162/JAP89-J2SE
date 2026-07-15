
import java.io.IOException;
import java.io.File;
public class Example9{

	public static void f1() {
			f2();
	}
	public static void f2() {
		  
		  try{
		  f3();
		}catch(IOException e){

		}
	}
	public static void f3() throws IOException{
		File file=new File("hello.txt");		
			file.createNewFile();
	}
	public static void main(String[] args){
				f1();
				System.out.println("END");
	}
}