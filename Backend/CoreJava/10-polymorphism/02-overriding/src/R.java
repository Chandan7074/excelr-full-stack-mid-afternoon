class  Q
{
	public void test1()	
	{
		System.out.println("from test-Q");
	}
}
class R  extends Q

{

	public void test1()
	{
		System.out.println("from test-R");

	}
	
	public static void main(String[] args) 
	{
		 R r1 = new R();
		r1.test1();
		System.out.println("done");
	}
}
