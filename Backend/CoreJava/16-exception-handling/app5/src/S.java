class S
{
	static void test() throws Throwable//throwable can able to address exception but cant exception cant address
	{
		Class.forName("");
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
