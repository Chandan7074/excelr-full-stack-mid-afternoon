class L
{
	static int  i =100;
	public static void main(String[] args) 
	{
		System.out.println("a: " + i);
		int i = 10;//local variable
		System.out.println("b: " + i);
		i = 20;//re-intialized the local variable
		System.out.println("c: " + i);
	}
}
