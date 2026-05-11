import java.util.Scanner;
class Vowels{
public static void main(String[] args) {
	char letter;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Letter ");
	letter=scanner.next().charAt(0);

		// INPUT VALIDATION
	if(!(letter>='a' && letter<='z'  || letter>='A' && letter<='Z')) {
			System.out.println("YOU Entered  INCorrect Input ... ");
			System.out.println("Thank YOU !!!  ");
			System.exit(0);	
	}
	
	switch (letter)
	{
		case 'A' : System.out.println("Its a Vowel"); break;
		case 'E' : System.out.println("Its a Vowel");break;
		case 'I' : System.out.println("Its a Vowel");break;
		case 'O' : System.out.println("Its a Vowel");break;
		case 'U' : System.out.println("Its a Vowel");break;
 		case 'a' : System.out.println("Its a Vowel");break;
		case 'e' : System.out.println("Its a Vowel");break;
		case 'i' : System.out.println("Its a Vowel");break;
		case 'o' : System.out.println("Its a Vowel");break;
		case 'u' : System.out.println("Its a Vowel");break;
		default :
		System.out.println("Its a Consonant");break;
	}
}

}