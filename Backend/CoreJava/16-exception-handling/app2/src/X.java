class X
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			ex = null;
		}
		System.out.println("main end: " + ex);
	}
}
/* local variables of try/catch/finally cant be used outside, if you want to use
variable before starting of the try block.