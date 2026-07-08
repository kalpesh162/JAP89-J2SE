
interface A{

}
interface B extends A{

}

class Sample{
	public static void main(String[] args) {
				//System.out.println(B instanceof A);		
				B b1=null;
				System.out.println(b1 instanceof A);  // false

				// null instanceof A

				System.out.println(b1 instanceof B);  // false

	}
}