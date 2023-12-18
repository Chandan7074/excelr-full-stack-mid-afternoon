class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100, 200);//you declare the two value for 2 intialization
		System.out.println("main end");
	}
	 static void test(int i,int j)//in this case the int i is an argument
	{ 
				
				System.out.println("from test: " + i);
				System.out.println("from test: " + j);
				i=1000;
				j=2000;
				System.out.println("from test: " + i);
				System.out.println("from test: " + j);

	}
}
