class J 
{
	static int  i =  test1();
	static int test1()
	{
		System.out.println("from test1");
		main(null);//we can use this call the main method by suppling null as a argument before jvm call the main method
			return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		System.out.println(i);
	}
}
