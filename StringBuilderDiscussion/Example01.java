
public class Example01{
	public static void main(String[] args) {
		/*
		String s1="Hello";
		s1.concat("Bye");
		System.out.println(s1);
		*/
		// public StringBuilder(String);
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("Bye");
		System.out.println(sb);

		System.out.println("-------------------");
		// public StringBuilder();
		StringBuilder sb1=new StringBuilder();
		System.out.println("capacity  "+sb1.capacity());

		// public StringBuilder(String);
		 // 16 +7
		StringBuilder sb2=new StringBuilder("Raveena");
		System.out.println("capacity  "+sb2.capacity());

		System.out.println("-------------------");

		StringBuilder sb3=new StringBuilder();
		System.out.println("Current capacity  "+sb3.capacity());
		sb3.append("Madhuri");

		System.out.println("Tell Me capacity "+sb3.capacity());
		sb3.append("TusharSathish");
		System.out.println("Tell Me capacity Beyond 16 "+sb3.capacity());

		//currentCapcity>thresholdValue
		//currentCapcity=currentCapcity*2+2  
		// newCapcity=CC*2+2

		// if capacity=34  you are adding beyond 34 
		// newCapcity=CC*2+2
		// 70
		System.out.println(sb3.length());

		for(int i=0;i<sb3.length();i++){
			 System.out.println(sb3.charAt(i));
		}


	}
}