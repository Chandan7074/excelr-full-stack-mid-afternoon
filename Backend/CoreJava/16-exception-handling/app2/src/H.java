import java.util.Scanner;
class H
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
		finally
		{
		System.out.println("From finally");
		}
		
	System.out.println("main end");
	}
}

//finally is a keyword in java
//'finally' is a block that we are using along with the try and catch blocks
/*whether the raised exception is there are not whether the raised exception 
object gets handled or not, once the control enters the try block then compulsory  
' finally' block would be excecuting.

- we can able to use finally block to close the resources that we have used/we
dont need any more.*/