class  I
{
	void test1()	
	{
		System.out.println("from test-I");
	}
}
class J  extends I

{

	int test1()
	{
		System.out.println("from test-J");
		return 10;
	}
	
	public static void main(String[] args) 
	{
		 J j1 = new J();
		j1.test1();
		System.out.println("done");
	}
}
