import java.util.Scanner;
class Test{
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int marks=0;
String Q1 = "What is the capital of India?";
String Q1Op1 = "Mumbai";
String Q1Op2 = "New Delhi";
String Q1Op3 = "Kolkata";
String Q1Op4 = "Chennai";

System.out.println(Q1);
System.out.println(Q1Op1);
System.out.println(Q1Op2);
System.out.println(Q1Op3);
System.out.println(Q1Op4);

System.out.println("Enter Ans  ");
String ans1=scanner.nextLine();

if(ans1.equals("New Delhi")){
	System.out.println("Correct ");
	marks++;
}
else{
	System.out.println("INCorrect ");
}

String Q2 = "Which planet is known as the Red Planet?";
String Q2Op1 = "Earth";
String Q2Op2 = "Mars";
String Q2Op3 = "Jupiter";
String Q2Op4 = "Venus";


System.out.println(Q2);
System.out.println(Q2Op1);
System.out.println(Q2Op2);
System.out.println(Q2Op3);
System.out.println(Q2Op4);


System.out.println("Enter Ans  ");
String ans2=scanner.nextLine();

if(ans2.equals("Mars")){
	System.out.println("Correct ");
	marks++;
}
else{
	System.out.println("INCorrect ");
}
String Q3 = "Which language is primarily used for Android app development?";
String Q3Op1 = "Python";
String Q3Op2 = "Java";
String Q3Op3 = "C++";
String Q3Op4 = "Swift";

System.out.println(Q3);
System.out.println(Q3Op1);
System.out.println(Q3Op2);
System.out.println(Q3Op3);
System.out.println(Q3Op4);



System.out.println("Enter Ans  ");
String ans3=scanner.nextLine();

if(ans3.equals("Java")){
	System.out.println("Correct ");
	marks++;
}
else{
	System.out.println("INCorrect ");
}
String Q4 = "How many days are there in a leap year?";
String Q4Op1 = "365";
String Q4Op2 = "366";
String Q4Op3 = "364";
String Q4Op4 = "367";

System.out.println(Q4);
System.out.println(Q4Op1);
System.out.println(Q4Op2);
System.out.println(Q4Op3);
System.out.println(Q4Op4);


System.out.println("Enter Ans  ");
String ans4=scanner.nextLine();

if(ans4.equals("366")){
	System.out.println("Correct ");
	marks++;
}
else{
	System.out.println("INCorrect ");
}

String Q5 = "Which data type is used to store whole numbers in Java?";
String Q5Op1 = "String";
String Q5Op2 = "boolean";
String Q5Op3 = "int";
String Q5Op4 = "double";


System.out.println(Q5);
System.out.println(Q5Op1);
System.out.println(Q5Op2);
System.out.println(Q5Op3);
System.out.println(Q5Op4);


System.out.println("Enter Ans  ");
String ans5=scanner.nextLine();

if(ans5.equals("int")){
	System.out.println("Correct ");
	marks++;
}
else{
	System.out.println("INCorrect ");
}


		System.out.println("Total Marks  "+marks);

	}
}