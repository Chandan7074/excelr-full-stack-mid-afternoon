class V 
{
	int i ;
	static  V test()
	{
		return new V();// method return type is a class
	}
	public static void main(String[] args) 
	{
		V v1 = test();
		System.out.println(v1.i);
	}
}
