class  Q
{
	static int i;
	public static void main(String[] args) 
	{
		
		System.out.println(i);
		int i = 10;//local var
		System.out.println(i);
		System.out.println(Q.i);//global variable value
		i = 20;//local var
		System.out.println(i);//current and local variable
		System.out.println(Q.i);
		Q.i = 40;
		System.out.println(i);
		System.out.println(Q.i);
		
	}
}
