class D
{
	static int i =  1;
	static 
	{
		i =2;//re-intialized the i value 
	}

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
