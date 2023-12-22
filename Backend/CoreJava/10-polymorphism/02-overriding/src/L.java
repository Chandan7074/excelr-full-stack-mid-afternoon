class  K
{
	void test1()	
	{
		System.out.println("from test-K");
	}
}
class L  extends K

{

	private void test1()
	{
		System.out.println("from test-L");

	}
	
	public static void main(String[] args) 
	{
		 L l1 = new L();
		l1.test1();
		System.out.println("done");
	}
}
