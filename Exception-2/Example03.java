import java.io.FileReader;
//import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Example03{
	
	//public static void main(String[] args) throws FileNotFoundException,IOException {
	  public static void main(String[] args) throws Exception {
	  //D:/Repeate-Java8/About String/App.java
		//FileReader fr=new FileReader("D:/Repeate-Java8/About String/App1.java");
		FileReader fr=new FileReader("D:/Repeate-Java8/About String/App.java");

		// int read()   -1
		int value=fr.read();
		while(value!=-1){
		System.out.print((char)value);
		value=fr.read();
		}


		fr.close();

		System.out.println("END");

	}
}