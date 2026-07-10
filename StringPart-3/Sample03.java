class Sample03{
	public static void main(String[] args) {
		String name="Kalpesh";
		int id=123;
		double salary=12222.50254;

		System.out.println(id + " " +name + " "+salary);

		String res=String.format("%5d %10s %.2f ",id,name,salary);

		System.out.println(res);

		//String	intern()  [Go to Notes ]
		//String	trim()
		System.out.println("----------------");
		String text="   Hello I Love India   ";
		System.out.println(text);
		System.out.println(text.trim());
		System.out.println("----------------");

		int num=1234;  
		//"1234"	
		String number=String.valueOf(num);
		System.out.println(number);

// primitive Type Conversion Object [reference Type]  Boxing
// What is Boxing ?
// What is UnBoxing
//	Conversion of reference Type into primitive Type Called UnBoxing

Integer i1=new Integer(10);
System.out.println(i1);
int x=i1;

System.out.println(x);

//String s1="1234A";  
String s1="1234";
int value=Integer.parseInt(s1); //java.lang.NumberFormatException:
System.out.println(value);
System.out.println(value+x);






			// method Overloaded
/*
	static String	valueOf(boolean b)	

	static String	valueOf(char c)	

	static String	valueOf(char[] data)	

	static String	valueOf(char[] data, int offset, int count)	

	static String	valueOf(double d)	

	static String	valueOf(float f)	

	static String	valueOf(int i)	

	static String	valueOf(long l)	

	static String	valueOf(Object obj)

*/

		//Integer revNum=new Integer(1234);
		System.out.println(Integer.reverse(10));




	}
}