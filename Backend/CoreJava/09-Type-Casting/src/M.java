class M 
{
	public static void main(String[] args) 
	{
		byte b = 10;
		int i = b;
		int j = (int) b;//explicite Up-Casting 
		double d = (double)i;//its not neccessary bcz the compiler only does this
		System.out.println("done");
	}
}
