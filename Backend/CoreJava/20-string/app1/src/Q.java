class Q
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		s1 = s1 + "xyz";//Once we create the String object we cant change content of the String object.The non change-able behaviour is called as immutable.
		System.out.println(s1);
	}
}
/*
* if u try to change the content of the String object then