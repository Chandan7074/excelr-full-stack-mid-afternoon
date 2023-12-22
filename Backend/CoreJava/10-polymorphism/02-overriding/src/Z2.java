class Z1
{
	static void test1(int i)
	{
		System.out.println("from test1.Z1");
	}
}
class Z2 extends Z1
{
	static void test1()
	{
		System.out.println("from test1.Z2");
	}

	public static void main(String[] args)
	{
		Z1 obj1 = new Z1();
		obj1.test1(10);
		Z2 z2 = new Z2();
		z2.test1(10);
		z2.test1();
		Z1 obj2 = new Z2();
		//obj1.test();
		obj2.test1(10);
	}

}