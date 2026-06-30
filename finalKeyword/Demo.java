import java.util.Random;
class Data{
	 final int arr[];

	 Data(){
	 	 arr=null;
	 }

	 Data(int size){

	 }
}
class Demo{
	public static void main(String[] args) {

		Data d1=new Data();
		Random random=new Random();
		d1.arr=new int[5];

		for(int i=0;i<d1.arr.length;i++){
			 d1.arr[i]=random.nextInt(10);
		}

		for(int i=0;i<d1.arr.length;i++){
			System.out.print(d1.arr[i] +"  ");

		}
		System.out.println();

		Data d2=new Data();
		d2.arr=d1.arr;

		for(int i=0;i<d2.arr.length;i++){
			System.out.print(d2.arr[i] +"  ");

		}



		
	}
}