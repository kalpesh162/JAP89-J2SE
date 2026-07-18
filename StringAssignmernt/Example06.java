/*

✅ Q6. Replace Vowels in Reverse with Vowel Count

Problem: Replace vowels (right to left) with the order they appear.

Input: International

Output: 6nt5rn4t32n1l
*/

public class Example06{

	public static int countVowel(String str){
		int cnt=0; String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++){
			char letter=str.charAt(i);
			if(vowels.contains(String.valueOf(letter)))
				cnt++;
		}
		return cnt;
	}
		
	public static String reverseWithVowelCount(String str){
			StringBuilder res=new StringBuilder(str.length());

			int cnt=countVowel(str);
			String vowels="aeiouAEIOU";
			for(int i=0;i<str.length();i++){
				 char letter=str.charAt(i);
				 if(vowels.contains(String.valueOf(letter))){
				 		res.append(cnt); cnt--;
				 }
				 else
				 	res.append(letter); 
			}
			return res.toString();
	}
	public static void main(String[] args) {
		String sent="International";	
		System.out.println(reverseWithVowelCount(sent));
	}
}
