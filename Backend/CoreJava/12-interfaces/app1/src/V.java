interface A
{
	void test1();

}
interface B
{
	void test2();
}
interface C
{
	void test3();
}
interface D
{
	void test4();
}
class  V implements A, B, C, D
{
	public void test1()
	{
		System.out.println("from test1()");
	}

	public void test2()
	{
		System.out.println("from test2()");
	}
	public void test3()
	{
		System.out.println("from test3()");
	}

	public void test4()
	{
		System.out.println("from test4()");
	}

	public static void main(String[] args) 
	{
		V u1 = new V();
		u1.test1();
		u1.test2();
		u1.test3();
		u1.test4();

	}
}
