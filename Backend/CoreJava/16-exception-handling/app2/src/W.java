import java.util.Scanner;
class W
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("enter one int value");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch begin");
			i = 10 / 0;
			System.out.println("from catch end");	
		}
		finally
		{
			//best practice, to close the opened resource
			sc.close();//To prevent data corruption and data inconsistency we may close some resources, those statements we can keep inside finally block
			//to execute some mandatory statement regardless  
			System.out.println("from finally");	
		}
		System.out.println("main end");
	}
}
