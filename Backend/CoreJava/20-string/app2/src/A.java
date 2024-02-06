class A
{
	public static void main(String[] args)
	{
		String s1 = "xyz";
		System.out.println(s1);
		s1.concat("hello");
		System.out.println(s1);
	}
}
/*
* Strings are immutable
* we can't change the String object once we create
* while calling s1.concat a new string object is generating with xyz and hello
* whenever we try to modify any  one character in the exisisting string object
a new string will be generating with all the modifications.
* once a string object created it cant modified further. if we try 
to modify a new string will be generating.
*/