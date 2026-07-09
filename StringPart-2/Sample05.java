class Sample05{
	public static void main(String[] args) {
		// public String[] split(String delimiter)
		String film="Andaz Apna Apna";
		String words[]=film.split(" ");

		for(String word : words)
			System.out.println(word);

			System.out.println("---------------------");

		String website="www.google.com";

		String parts[]=website.split("\\.");
		for(String word : parts)
			System.out.println(word);

		// public String substring(int start)
		// public String substring(int start,int end)

		String movie="Hum Sath Sath Hai";
		System.out.println(movie.substring(4));
		// from   to
		// start=   <end
		System.out.println(movie.substring(4,13));



	}
}