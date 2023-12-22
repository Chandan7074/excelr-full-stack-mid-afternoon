class    Y
{
	public static void test1()	
	{
		System.out.println("from test-  Y");
	}
}
 class  Z  extends   Y

{

	public  static void test1()
	{
		System.out.println("from test-  Z");

	}
	
	public static void main(String[] args) 
	{
		   Z z1 = new  Y();
		  z1.test1();
		System.out.println("done");
	}
}
