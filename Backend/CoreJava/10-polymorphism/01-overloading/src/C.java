class C 
{
	static void test()
	{
		System.out.println("test()");
	}

	static String test(int i)
	{
		return "abc";
	}

	static char test(int i, int j)
	{
		return 'a';
	}

	static boolean test(int i , int j, int k)
	{
		return true;
	}
	public static void main(String[] args) 
	{
		B.test();
		B.test(10);
		B.test(10,20);
		B.test(10,20,30);
		System.out.println("done");
	}
}
