class  A
{
	int i;//without static keyword then the members comes under non-static
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
//non static members can't access without any references 