
// How we can say StringBuilder is faster ?
// StringBuilder is not synchronized
// StringBuilder is not thread Safe

public class Example{
	public static void main(String[] args) {
			
			StringBuffer sb1=new StringBuffer("Kareena");
			StringBuffer sb2=new StringBuffer("Kapoor");
			long start1=System.currentTimeMillis();

			for(int i=0;i<100000000;i++)
				sb1.append(sb2);

			long end1=System.currentTimeMillis();

			StringBuilder sb3=new StringBuilder("Raveena");
			StringBuilder sb4=new StringBuilder("Tandon");

			long start2=System.currentTimeMillis();
			for(int i=0;i<100000000;i++)
				sb3.append(sb4);
			long end2=System.currentTimeMillis();
		
			System.out.println("StringBuffer  "+(end1-start1) + "ms");
			System.out.println("StringBuilder  "+(end2-start2) + "ms");
		
	}
}

/*
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Arrays.java:3332)
        at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
        at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:459)
        at java.lang.StringBuffer.append(StringBuffer.java:300)
        at Example.main(Example.java:14)

*/