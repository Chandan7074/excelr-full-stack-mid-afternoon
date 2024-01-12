import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("enter a sentence!");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
		System.out.println("try begin");
		int i = Integer.parseInt(s1);
		System.out.println("+++++++");
		int k = i / 0;
		System.out.println("try end");
		}
		catch (NumberFormatException ex2)
		{
		System.out.println("from outer-catch:" +ex2);
		}
	System.out.println("main end");
	}
}

