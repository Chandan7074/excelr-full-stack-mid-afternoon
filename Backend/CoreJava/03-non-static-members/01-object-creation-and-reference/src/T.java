class T
{
	int i;
	static void test(int i)
	{
		i = 20;
	}
	public static void main(String[] args) 
	{
		T t1 =  new T();
		t1.i = 10;
		System.out.println("before calling test(T): " + t1.i);
		//call by value or pass by value
		//changes is the destination would not be reflecting to the source.
		//we are not seding a reference instead just the value, in this case there is no chance of modificationto the object.
		T.test(t1.i);
		System.out.println("after calling test(T): " + t1.i);
	}
}
