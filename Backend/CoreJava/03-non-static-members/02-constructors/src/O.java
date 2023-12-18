class O 
{
	O(int i)//requuired is int 
	{
		System.out.println("int()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O();//but we passing the no argument constructor
		O o2 = new O(10);
		System.out.println("main end");
	}
}
