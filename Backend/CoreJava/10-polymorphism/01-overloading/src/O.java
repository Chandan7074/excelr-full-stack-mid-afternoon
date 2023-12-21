class N
{
	public void test()
	{
		System.out.println("from N test()");
	}
}
class O extends N
{
	public static void test(int i)
	{
		super.this();//we can't add in the static
		System.out.println("from O test(int)");
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test(10);
		obj.test();
		System.out.println("Hello World!");
	}
}
