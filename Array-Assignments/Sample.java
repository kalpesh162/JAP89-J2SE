

// Here we are learning returning more than values
class Sample{

	// method can return at most one value

	static int[] getValues(){
		int A[]={11,22,33,44,55};
		return A; // type of A ==> int[]
	}	

	public static void main(String[] args) {
		
		int[] arr=getValues();
		// int[]

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +"  ");

	}

}