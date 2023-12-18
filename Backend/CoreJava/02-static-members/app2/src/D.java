class D
{
	static int i = 10;
	static int j = test1();
	static int test1()
	{
		return i;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
