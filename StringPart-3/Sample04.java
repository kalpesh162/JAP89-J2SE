class Sample04{
	public static void main(String[] args) {
		
			//public String[] split(String )
		String str="a:b:c:d:e";
		String[] words=str.split(":");

		for(int i=0;i<words.length;i++)
			System.out.println(words[i]);

			System.out.println("-------------");
		for(String word : words)
			System.out.println(word);
	}
}