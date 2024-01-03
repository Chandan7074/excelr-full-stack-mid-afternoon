abstract class O
{
	abstract void test1();
	abstract void test2();
}

abstract class  P extends O
{
	void test1()
	{
		System.out.println("from test1()");
	}

	void test2()
	{
		System.out.println("from test2()");
	}
	void test3()
	{
		System.out.println("from test3()");
	}
	abstract void method1();
}
class Q extends P
{
	void method1()
	{
		System.out.println("from method1()");
	}

	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.test1();
		q1.test2();
		q1.test3();
		System.out.println("done");
	}
}
