class Example04{
	public static void main(String[] args) {
		//1
		StringBuilder sb=new StringBuilder("book");
		System.out.println(sb);
		sb.insert(0,1);
		// insert overloaded method
		System.out.println(sb);

		// public StringBuilder insert(int index,...)

		/*
		public java.lang.StringBuilder insert(int, char[], int, int);
  public java.lang.StringBuilder insert(int, java.lang.Object);
  public java.lang.StringBuilder insert(int, java.lang.String);
  public java.lang.StringBuilder insert(int, char[]);
  public java.lang.StringBuilder insert(int, java.lang.CharSequence);
  public java.lang.StringBuilder insert(int, java.lang.CharSequence, int, int);
  public java.lang.StringBuilder insert(int, boolean);
  public java.lang.StringBuilder insert(int, char);
  public java.lang.StringBuilder insert(int, int);
  public java.lang.StringBuilder insert(int, long);
  public java.lang.StringBuilder insert(int, float);
  public java.lang.StringBuilder insert(int, double);
  */

  // public void setCharAt(int index,char ch);

 	StringBuilder movie =new StringBuilder("The GodFather") ;
 	movie.setCharAt(7,'f');
 	System.out.println(movie);

 	StringBuilder bookName=new StringBuilder("Vyakti Aani Valli");
 	// from=start        <end
 	System.out.println(bookName.substring(7,11));
 	System.out.println(bookName);


	}
}