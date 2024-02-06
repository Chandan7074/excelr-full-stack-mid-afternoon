class D
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");

		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));// in the StringBuffer its not going to check content its check references itself.
	}

}
/* inside StringBuffer object
String class
----------
toString()
equals()
hashCode()

StringBuffer class
-------
toString()
*/