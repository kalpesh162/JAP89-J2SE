package  p1;

public class A{
	private int privateField=11;
	int defaultField=22;
	protected int procField=33;
	public int publicField=44;

	private void privateMethod(){
		System.out.println("private ()");
	}


	void defaultMethod(){
		System.out.println("default ()");
	}


	protected void protectedMethod(){
		System.out.println("protected ()");
	}

	public void publicMethod(){
		System.out.println("public ()");
	}

}