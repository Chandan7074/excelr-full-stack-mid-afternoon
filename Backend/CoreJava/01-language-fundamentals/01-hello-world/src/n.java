class n 
{
	public static void main(String[] args) 
	{
		int x = 4;
		int y = x++ + ++x - --x - x--;
		System.out.println(y);
	}
}
