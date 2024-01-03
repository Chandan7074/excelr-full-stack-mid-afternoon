abstract class L
{
	abstract void test1();
	abstract void test2();
}

abstract class  M extends L
{
	void test1()
	{
		System.out.println("from test1()");
	}

	void test2()
	{
		System.out.println("from test2()");
	}
}
class N extends M
{
	void test3()
	{
		System.out.println("from test3()");
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		n1.test1();
		n1.test2();
		n1.test3();
		System.out.println("done");
	}
}
