class K
{
	public static void main(String[] args) 
	{
		String s1 = "Hi India";
		String s2 = "Hi \"India\" ";//backslash is not counted 
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
/* 
*straigth away we cant keep "" in the middle of the ""
*/