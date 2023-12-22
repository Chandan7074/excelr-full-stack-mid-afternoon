class  S
{
	 void test1()	
	{
		System.out.println("from test-S");
	}
}
class T  extends S

{

	protected void test1()
	{
		System.out.println("from test-T");

	}
	
	public static void main(String[] args) 
	{
		 T t1 = new T();
		t1.test1();
		System.out.println("done");
	}
}
