class W 
{
	static int i;
	static int j = i++ + i;//0+1=1 s0 the answer is 1 and the j value is also 1
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
