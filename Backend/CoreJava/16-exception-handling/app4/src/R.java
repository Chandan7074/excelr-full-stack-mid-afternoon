import java.io.FileReader;
import java.io.IOException;
class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			FileReader fileReader = new FileReader("");
		}
		catch (IOException ex)//it can be handled multiple exception handling
		{
			System.out.println("from catch: " + ex);
			//ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
