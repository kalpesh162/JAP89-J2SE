import java.util.Scanner;
/*
import java.lang.System;
import java.lang.String;
import java.lang.*;
*/
class PrintNumbers{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter End Point ");

			// Hey Scanner from where you are scanning
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();

			int start=1;

			while (start<=n) {
						System.out.println(start);
					start++;
			}

	}
}