class I
{
	static int test(byte b)
	{
		
		return b;
	}
	
	public static void main(String[] args) 
	{
		byte b = 10;
		
		System.out.println(test(b) + ":done");
	}
}
//sending and receiving  same value but return type is int 
//byte method automatically upcasting to the int method