class Compare{
	public static void main(String[] args) {
			
	String s1="Kareena";
	String s2=new String("Kareena").intern();

	if(s1==s2){
		System.out.println("Equal");
	}
	else{
		System.out.println("NOT Equal");
	}
 
 }
}
