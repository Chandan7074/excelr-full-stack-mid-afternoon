class K
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;//exception causing statement is outside in this case try block won't execute
		System.out.println("main begin");
		try
		{
			System.out.println("from try");
			
		}
		catch (ArithmeticException ex)
		{
		System.out.println("from catch:" + ex);
		}
		finally
		{
		System.out.println("from finally");
		}
		System.out.println("main begin");
	}
}
