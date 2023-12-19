class G
{
	static void test(double d)
	{
		System.out.println("test(double): " + d);
	}
	
	public static void main(String[] args) 
	{
		int i = 100;
		test(i);//first going to upcast to double by the compiler
		System.out.println("done");
	}
}
