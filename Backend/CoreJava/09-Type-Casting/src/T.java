class T
{
	static int test(double d)
	{
		System.out.println("test(double): " + d);
		return (int)d;
	}
	public static void main(String[] args) 
	{
		int i = test(200);
		long l = test(10.0);
		System.out.println(i);
		System.out.println(l);
		System.out.println(" World!");
	}
}
