//Relatonal Operator   <  >  <=  >= !=  ==
class Sample1{
	public static void main(String[] args) {
		// <  >  <= >=  !=  ==
		int num1=11;  // num1 is a type of int
		int num2=22;
		boolean isGreater=num1<num2;
		System.out.println(isGreater);
		System.out.println(num1<num2);
		System.out.println(num1>num2);
		//System.out.println(num1=num2);
		// Assignemt Operator  =
		// Comprison Operator  ==
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		// <=  >=
		int digit=100;
		System.out.println(digit>=100);
		System.out.println(digit<=100);
		// inclusive  [a>=  =<b]

		double val1=11.11;
		int val2=22;
		System.out.println("==>   "+(val2>val1));
		System.out.println("==>   "+(val2==val1));

		// Here Val2 is a type of int  and val1 is a type of double 
		// Basically if type is different theres should ot to be comparison
	    // But Here the comparison done

		// How  When Compiler compiles this code  it promote type (int) ---> to double

		// like  (double)val2==va1       22.0==11.11




	}
}