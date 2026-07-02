import java.util.Scanner;
class Question{
	String question;
	String op1;
	String op2;
	String op3;
	String op4;
	private String ans;  //setter getter

	Question(String question,String op1,String op2,String op3,String op4,String ans){
		this.question=question;
		this.op1=op1;
		this.op2=op2;
		this.op3=op3;
		this.op4=op4;
		this.ans=ans;
	}

	// behaviour how to show that Question
	public void showQuestion(){
		System.out.println(question);
		System.out.println("---------------------------");
		System.out.println(" "+op1);
		System.out.println(" "+op2);
		System.out.println(" "+op3);
		System.out.println(" "+op4);
		System.out.println("===============================");

	}


	@Override
	public String toString(){
		return "";
	}

	public String getAns(){
		return this.ans;
	}

}
class App{
	public static void main(String[] args) {
		int marks=0;
	Question q1 = new Question(
	    "What is the capital of India?",
	    "Mumbai",
	    "New Delhi",
	    "Kolkata",
	    "Chennai",
	    "New Delhi"
	);

	Question q2 = new Question(
	    "Which planet is known as the Red Planet?",
	    "Earth",
	    "Mars",
	    "Jupiter",
	    "Venus",
	    "Mars"
	);

	Question q3 = new Question(
	    "Which language is primarily used for Android development?",
	    "Python",
	    "Java",
	    "C++",
	    "Swift",
	    "Java"
	);

	Question q4 = new Question(
	    "How many days are there in a leap year?",
	    "365",
	    "366",
	    "364",
	    "367",
	    "366"
	);

	Question q5 = new Question(
	    "Which data type is used to store whole numbers in Java?",
	    "String",
	    "boolean",
	    "int",
	    "double",
	    "int"
	);

	
	Scanner scanner=new Scanner(System.in);

	// Code to show this 
	q1.showQuestion();
	String ans1=scanner.nextLine();
	if(ans1.equals(q1.getAns())){
		marks++;
	}
	q2.showQuestion();
	String ans2=scanner.nextLine();
	if(ans2.equals(q2.getAns())){
		marks++;	
	}
	q3.showQuestion();
	String ans3=scanner.nextLine();
	if(ans3.equals(q3.getAns())){
		marks++;
	}
	q4.showQuestion();
	String ans4=scanner.nextLine();
	if(ans4.equals(q4.getAns())){
		marks++;
	}
	q5.showQuestion();
	String ans5=scanner.nextLine();
	if(ans5.equals(q5.getAns())){
		marks++;
	}

	System.out.println("Total Marks  "+marks);
		
	}
}