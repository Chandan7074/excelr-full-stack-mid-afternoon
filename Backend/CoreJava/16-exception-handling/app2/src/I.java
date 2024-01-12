import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a sentence!");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
			System.out.println("try begin");
			int i= Integer.parseInt(s1);
			System.out.println("+++++++");
			int k = i / 0;
			System.out.println("try end");
		}		
			
		catch (NumberFormatException ex)
		{
		System.out.println("from outer-catch:" +ex);
		}
		catch (ArithmeticException ex)
		{
		System.out.println("from outer-catch:" +ex);
		}
		finally
		{
		System.out.println("From finally");
		}
		
	System.out.println("main end");
	}
}