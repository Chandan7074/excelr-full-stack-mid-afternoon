class F
{
	static 
	{
		System.out.println(i);//before declaration the usage is not possible
	}
	static int i = 2;//

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
