class J
{
	static int i;
	static 
	{
		j =i;//modified
	}
		static int j = 40;//we re- intialize the j value
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
