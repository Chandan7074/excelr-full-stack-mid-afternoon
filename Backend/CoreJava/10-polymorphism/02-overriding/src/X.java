class    W
{
	public static void test1()	
	{
		System.out.println("from test-  W");
	}
}
 class  X  extends   W

{

	public  static void test1()
	{
		System.out.println("from test-  X");

	}
	
	public static void main(String[] args) 
	{
		   W x1 = new  X();
		  x1.test1();
		System.out.println("done");
	}
}
