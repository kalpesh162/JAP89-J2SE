//Checked Exception 
// IO Opearation

import java.io.File;
import java.io.IOException;

public class Example7{
	
	public static void main(String[] args) {

		File file=new File("myfile.txt");

		try{
			file.createNewFile();
		}catch(IOException e){
				System.out.println("  ---> "+e);
		}

		System.out.println("END");
		
	}
}


