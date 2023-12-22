class  M
{
	void test1()	
	{
		System.out.println("from test-M");
	}
}
class N  extends M

{

	protected void test1()
	{
		System.out.println("from test-M");

	}
	
	public static void main(String[] args) 
	{
		 N n1 = new N();
		n1.test1();
		System.out.println("done");
	}
}
