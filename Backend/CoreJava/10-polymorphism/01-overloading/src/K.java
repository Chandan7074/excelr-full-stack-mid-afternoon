class J
{
	static public void test()
	{
		System.out.println("from H test()");
	}
}
class K extends J
{
	static public void test(int i)
	{
		System.out.println("from I test(int)");
	}
	public static void main(String[] args) 
	{

		
		K.test();
		K.test(10);
		System.out.println("Hello World!");
	}
}
