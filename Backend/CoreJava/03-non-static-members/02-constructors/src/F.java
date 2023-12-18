class  F
{
	int i;

	F()
	{
		System.out.println("F()");
		i = 10;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);//without using any reference we can call them
		System.out.println("done");
	}
}
