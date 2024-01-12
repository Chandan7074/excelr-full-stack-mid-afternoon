class I
{
	int test()
	{

		try
		{
			return 10; 
			
		}
		catch (ArithmeticException ex)
		{
			//return 20;
		}
		catch (NullPointerException ex)
		{
			//return 30;
		}
		finally
		{
			
		}
		return 20;
		
	
		
	}
}
