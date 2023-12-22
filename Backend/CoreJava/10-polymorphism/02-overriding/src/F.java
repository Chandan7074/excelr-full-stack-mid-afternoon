class  E
{
	void test1()	
	{
		System.out.println("from test-E");
	}
}
class F  extends E

{

	void test1()
	{
		System.out.println("from test-F");

	}
	
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test1();
		System.out.println("done");
	}
}
