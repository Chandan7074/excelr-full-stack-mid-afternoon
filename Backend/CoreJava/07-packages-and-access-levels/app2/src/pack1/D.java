package pack1;
class D
{
	private void test1()
	{
		System.out.println("test1()");
	}
	void test2()
	{
		System.out.println("from 2");
	}
}
class E extends D
{

	public static void main(String[] args) 
	{
		D obj  = new D();
		//obj.test1();
		obj.test2();
		System.out.println("World!");
	}
}
