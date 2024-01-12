import java.sql.DriverManager;
import java.sql.SQLException;
class Q
{
	public static void main(String[] args) throws Throwable//throwable is a root of exception and error
	{
		System.out.println("main begin");
		DriverManager.getConnection("");
		Thread.sleep(1000);
		Class.forName("");
		System.out.println("main end");
	}
}
