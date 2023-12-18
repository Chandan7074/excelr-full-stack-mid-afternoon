class M
{
	static int i;
	static void test()
	{
		System.out.println("from test: " + i);
	}
}
class N
{

	public static void main(String[] args) 
	{
		System.out.println("from main: " + M.i);//in order to access the static members of one class to another since the two is static
		M.test();
	}
}
