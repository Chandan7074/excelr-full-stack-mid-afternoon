class I
{
	static void test(Character ch)
	{
		System.out.println("value: " + ch);
	}

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		test('a');//auto-boxing
		char ch1 = 'b';
		test(ch1);//auto-boxing
		Character ch2 = 'c';//auto-boxing
		test(ch2);//we are sending reference to reference here is no boxing
	}
}
