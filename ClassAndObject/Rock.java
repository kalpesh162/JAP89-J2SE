class Rock{
	Rock(){
		System.out.println("Default Constructor");
	}

	void print(){
		System.out.print("HI");
	}

	public static void main(String[] args) {
		  //Rock r1=new Rock();
		  //Rock r2=new Rock();
		  //Rock r3=new Rock();

		// r1.print();

		for(int i=0;i<5;i++){
			new Rock().print();
		}
       //  new Rock()   Anonymous Object
	}
}

