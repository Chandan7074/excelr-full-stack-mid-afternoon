class U 
{
	int i;
	static U test()
	{
		U obj = new U();
		obj.i = 10;
		return obj;//obj is a refrence
	}
	public static void main(String[] args) 
	{
		U u1 = test();//>this is the test method caller
		System.out.println(u1.i);

	}
}
