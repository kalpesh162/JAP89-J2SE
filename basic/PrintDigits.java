class PrintDigits{
	public static void main(String a[]){
		   int num=1234; 
           int unitPlace=num%10;
           num=num/10;
           int tenPlace=num%10;
           num=num/10;
           int hundreadPlace=num%10;
           num=num/10;
           int thPlace=num%10;

           System.out.println(unitPlace);
           System.out.println(tenPlace);
           System.out.println(hundreadPlace);
           System.out.println(thPlace);

	}
}