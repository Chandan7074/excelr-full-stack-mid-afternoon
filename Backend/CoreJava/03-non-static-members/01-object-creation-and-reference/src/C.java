class C 
{
	void test()//its a non-static method so we can't acces the static method
	{
	}
	public static void main(String[] args) 
	{
		test();//we create a reference for this bcz of this member is non-static
		System.out.println("done");
	}
}
