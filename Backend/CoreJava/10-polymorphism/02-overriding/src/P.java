class  O
{
	void test1()	
	{
		System.out.println("from test-O");
	}
}
class P  extends O

{

	public void test1()
	{
		System.out.println("from test-P");

	}
	
	public static void main(String[] args) 
	{
		 P p1 = new P();
		p1.test1();
		System.out.println("done");
	}
}
