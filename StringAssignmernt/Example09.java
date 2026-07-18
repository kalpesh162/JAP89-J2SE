
/*
✅ Q9. Count Words in a Sentence

Problem: Count the number of words in a sentence.

Input: hello i am java developer

Output: 5
	public static int countWords(String str){
		if(str==null) return 0;
		if(str.isEmpty()) return 0;
		String words[]=str.split(" ");
		return words.length;		
	} 
	String s=null;
	countWords(s);
	String s="null";	

*/

public class Example09{
	public static int countWords(String str){
		String words[]=str.split(" ");
		return words.length;		
	} 

	public static void main(String[] args) {
		String str="hello i am java developer";
		String words[]=str.split(" ");		
		System.out.println(words.length);

		int count=countWords(str);
	}
}