interface O
{
	void test1();
	int test2(int i);
}
class P implements O
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
 
	public static void main(String[] args) 
	{
		P obj = new P();
			obj.test1();
			obj.test2(10);
	
	}
}
