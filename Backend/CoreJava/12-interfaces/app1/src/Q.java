interface Op
{
	void test1();
	int test2(int i);
	boolean test3(boolean b);
}
abstract class Po implements Op
{
	public void test1()
	{
		System.out.println("from test1()");
	}

	public int test2(int i)
	{
		System.out.println("from test2(int)");
		return 0;
	}
}
	class Q extends Po
	{
		public boolean test3(boolean b)
		{
			
			return b;
		}
			void test4()
			{
			System.out.println("from test4()");
			}
 
 
	public static void main(String[] args) 
	{

		Q obj = new Q();
			obj.test1();
			obj.test2(10);
			System.out.println(obj.test3(true));
			obj.test4();
	
	}
}
