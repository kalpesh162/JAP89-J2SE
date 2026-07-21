
// Now i understood finally 
// How to use finally
import java.io.FileWriter;
import java.io.IOException;
public class Example10{
	public static void main(String[] args) {
		FileWriter fw=null;
        
        try{
		 	fw=new FileWriter("letter.txt");
			fw.write("Hello");
			fw.write("\n");
			fw.write('A');
			fw.write("\n");
			fw.write(100);
			fw.write("\n");
			char arr[]={'M','A','N','G','O'};
			fw.write(arr);
			fw.flush();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		/*
		finally{
			try{
			fw.close();
			}catch(IOException e){

			}
		}*/

		finally{
			if(fw!=null){
					try{
						fw.close();
					}catch(IOException e){

					}
			}
		}
		
		
	}
}