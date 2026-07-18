/*
class A extends Throwable{

}

class A extends Exception{

}

class A extends RuntimeException{

}
*/

class A{

}
public class Example05{
	public static void main(String[] args) {
		System.out.println("Hello");

		throw new A();

		//error: incompatible types: A cannot be converted to Throwable         

	}
}

// throw iss generally with customized exception |  used defined exception


