class  B
{
	static int i =10;
	static int j =test();//calling the test method for the knowing of j value
	static int test()
	{
		return 20;//the return value for j so the j value is 20
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);

	}
}
