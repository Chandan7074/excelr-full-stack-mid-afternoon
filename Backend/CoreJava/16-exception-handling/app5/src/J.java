class J
{
	static void test1() 
	{
		test2();
	}
	static void test2() 
	{
		test3();
	}
	static void test3() throws ArithmeticException//for the uncheked exception there is no need of keeping throws.
	{
		int i = 10 / 0;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
