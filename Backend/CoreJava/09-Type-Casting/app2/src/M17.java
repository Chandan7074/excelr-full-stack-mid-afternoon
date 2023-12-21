class M17
{
	static C test()
	{
		 A a1 = new D();
		 return (C)a1;//down casting A to C 
	}
	public static void main(String[] args) 
	{
		D d1 = (D)test();
		System.out.println("Hello World!");
	}
}
