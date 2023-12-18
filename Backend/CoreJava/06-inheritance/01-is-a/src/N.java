class M 
{
	M()
	{
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		System.out.println("N()");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("done");
	}
}
//in java Object class is the super-most class .
// each class whether directly ot indirectly extends objects cls.
// in the ibject  we have many members  which are required by all the classes in java (User or inbuilt)
//all those members would be inherited to all the class default