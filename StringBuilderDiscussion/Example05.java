/*
StringBuilder	delete(int start, int end)	

StringBuilder	deleteCharAt(int index)

StringBuilder	replace(int start, int end, String str)

*/
public class Example05{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello I Love India");
			// start>=  <end
		sb.delete(8,12);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);

		sb.replace(0,4,"Hello");
		System.out.println(sb);
	}
}