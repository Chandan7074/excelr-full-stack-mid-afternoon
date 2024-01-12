class A 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("");
	}
}
//we can use throws keyword for any method.
/* mainly we are going to use throws for handling over the resposibility of handling
checked exceptions to another block/JVM
- by using throws we can skip 