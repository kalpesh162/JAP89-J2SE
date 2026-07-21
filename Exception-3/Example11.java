import java.io.FileWriter;
import java.io.IOException;
public class Example11{
	
	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("alphabets.txt");){
			for(int i=0;i<255;i++){
				 fw.write((char)i);
				 fw.write("  ");
				 if(i%10==0)
				 	fw.write("\n");
			}
			 fw.flush();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}


		System.out.println("ENDS ");

	}


}