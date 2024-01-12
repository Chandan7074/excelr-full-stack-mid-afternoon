import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("enter a number to get AE or Enter alphabets to get NFE!");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("+++++++");
			System.out.println("try end");
		}
			
			
		catch (NumberFormatException | ArithmeticException ex)
		{
		System.out.println("from outer-catch:" +ex);
		}
	System.out.println("main end");
	}
}

