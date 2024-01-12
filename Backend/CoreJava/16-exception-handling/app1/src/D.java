class  A
{
}
class B extends A
{
}
class D extends B
{

	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		Object obj = new Object();//only pointing to Object class Object not the D
		D d1 = (D) obj;
		System.out.println("Main end");
	}
}
