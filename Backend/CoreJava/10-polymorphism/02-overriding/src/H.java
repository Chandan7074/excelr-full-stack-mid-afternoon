class  G
{
	void test1()	
	{
		System.out.println("from test-G");
	}
}
class H  extends G

{

	void test1()
	{
		System.out.println("from test-H");

	}
	
	public static void main(String[] args) 
	{
		G g1 = new H();
		g1.test1();

		G g2 = new G();
		g2.test1();
		System.out.println("done");
	}
}