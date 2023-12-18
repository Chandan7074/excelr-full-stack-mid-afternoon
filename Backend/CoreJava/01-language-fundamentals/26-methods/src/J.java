class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	 static void test()
	{
				System.out.println("from test");
				return;//the return statement is not mandatory in void bcz the void method also a having a return type
	}
}
/* main method also having an return type