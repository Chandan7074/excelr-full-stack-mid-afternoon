class M 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static
	{
		M obj = new M();
		obj.test1();
	}
}
/* Till the Java JDK 1.6 we could able to 
run a program without the main method , but 
from java JDK 1.7 compulsory we should be having the main method 