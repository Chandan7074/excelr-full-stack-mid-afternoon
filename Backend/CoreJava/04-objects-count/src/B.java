class  B
{
	static int x = 10;

	public static void main(String[] args) 
	{
		System.out.println("A: " + x);
		System.out.println("B: " + B.x);
		B b1  = new B();//when we create the object the static is the part of this object
		System.out.println("C: " + b1.x);
	}
}
