class X 
{
	static int i;
	static int k =i;
	static int j= k;
	static int l= l;//the self reference in the intializer so we got an error
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
