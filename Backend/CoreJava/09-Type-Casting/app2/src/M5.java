class M5 
{
	public static void main(String[] args) 
	{
		A a1  = new B();//auto upcasting --> a1 = (A) new B();
		B b1 = new C();
		C c1 = new D();
		System.out.println("done");
	}
}
