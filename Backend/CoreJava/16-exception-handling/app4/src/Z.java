import java.text.ParseException;
import java.text.SimpleDateFormat;
class z
{
	public static void main(String[] args) 
	{
		SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd-HH:ss") ;
		try
		{
			df.parse("");
		}
		catch (ParseException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
