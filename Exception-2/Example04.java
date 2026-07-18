//throw
// What is different between throws and throw
// throw used to raise an exception
// throw new Type();

public class Example04{
	public static void main(String[] args) {
			/*
			System.out.println(11/0);  //throw new ArithmeticException("/ by Zero")		

			System.out.println("Hello");
			*/

			throw new ArithmeticException("/ by Zero");
			//error: unreachable statement
			System.out.println("Hello");



	}
}

// we can not raised multiple Exception
//throw new ArithmeticException(),new NullPointerException();
// syntax throw new Type()

//  class A{}      throw new A();



