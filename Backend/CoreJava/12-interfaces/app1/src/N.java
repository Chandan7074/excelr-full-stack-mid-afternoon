interface M
{
	void test1();
}
	class N implements M
	{
		public void test1()
		{
			System.out.println("from N.test1()");
		}
		public static void main(String[] args)
		{
			M obj1 = null;
			M obj2 = new N();
			obj2.test1();
			System.out.println("done");
		}
	
}