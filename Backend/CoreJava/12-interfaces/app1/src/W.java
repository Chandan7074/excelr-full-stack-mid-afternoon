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
abstract class D implements A, B, C

{
	public void test1()
	{
		System.out.println("from test1()");
	}

	public void test2()
	{
		System.out.println("from test2()");
	}
}

class  W extends D
{
	
	public void test3()
	{
		System.out.println("from test3()");
	}

	public static void main(String[] args) 
	{
		W u1 = new W();
		u1.test1();
		u1.test2();
		u1.test3();

	}
}
