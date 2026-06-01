class Data{
	int x=1;

	Data(){
	System.out.println("Inside Defaulr Constructor "+x); //1
		x=2;
	System.out.println("Inside Defaulr Constructor "+x); //2
	}
	Data(int y){ 
		x=y;
	}

}

class Test{
	public static void main(String[] args) {
			Data d1=new Data();			
			System.out.println(" main  "+d1.x);
	}
}