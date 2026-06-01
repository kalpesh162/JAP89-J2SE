public  class App{
	public static void main(String[] args) {
		Person person1=new Person("Kalpesh");

		// 0
		System.out.println(person1.getAge());

		//person1.setAge(22);
		for(int i=1;i<=23;i++)
			person1.growOlder();

	}
}