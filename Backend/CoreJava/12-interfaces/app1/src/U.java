interface S
{
	void test1();

}
interface T
{
	void test2();
}
class  U implements S, T
{
	public void test1()
	{
		System.out.println("from test1()");
	}

	public void test2()
	{
		System.out.println("from test2()");
	}

	public static void main(String[] args) 
	{
		U u1 = new U();
		u1.test1();
		u1.test2();

	}
}
