class  F
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test();
		System.out.println("from main end");
	}
	public static void test() 
	{
		if(true)
		{
			for (int i =  1; i <= 5; i++ )
			{
				int j = 0;
				while(j <= 1)
				{
				int k = 10;
				do
				{
					System.out.println("from do-while body");
					k++;
				}
				while (k <=12);
				j++;
				}
			}
	}
	
}
}
