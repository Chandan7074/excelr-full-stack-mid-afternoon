class J
{
	static int test(short s)
	{
		
		return s;
	}
	
	public static void main(String[] args) 
	{
		byte b = 10;
		double d = test(b);//upcasting 10.0 by the compiler 
		System.out.println("d: " + d +":done");
	}
}