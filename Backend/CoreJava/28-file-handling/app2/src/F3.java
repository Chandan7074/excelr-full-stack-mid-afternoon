import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F3
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test1.txt");
		FileWriter out = new FileWriter(f1);
		//char to int convertion
		out.write('a');
		out.flush();
		out.close();
		System.out.println("done");
	}
}