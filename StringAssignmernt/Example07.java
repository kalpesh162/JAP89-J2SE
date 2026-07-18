
/*
✅ Q7. Move Vowels to End (Sorted), Keep Consonants First

Problem: Separate consonants and vowels. Keep consonants in order and append sorted vowels.

Input: International

Output: ntrntnlAaeio
*/
// Arrays.sort(char arr[])

import java.util.Arrays;
public class Example07{

	public static boolean isVowel(char letter){
		 String str="aeiouAEIOU";
		return str.contains(String.valueOf(letter));
	}

	public static  String consonantsVowelsOrder(String str){
			StringBuilder vowel=new StringBuilder(str.length());
			StringBuilder consonant=new StringBuilder(str.length());
			for(int i=0;i<str.length();i++){
				  char letter=str.charAt(i);
				  if(isVowel(letter))
				  	vowel.append(letter);
				  else
				  	consonant.append(letter);
			}

			//consonant SB String --> char[]
			char cons[]=consonant.toString().toCharArray();
			char vow[]=vowel.toString().toCharArray();

			Arrays.sort(cons);  // sorted Array
			Arrays.sort(vow);  // sorted Array

			return String.valueOf(cons)+String.valueOf(vow);

			//return consonant.append(vowel).toString();
	} 

	public static void main(String[] args) {
			String sent="International";
			System.out.println(consonantsVowelsOrder(sent));
	}
}