import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your first name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter your address?");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Your name: " + name + " Your address: " + address);
		sc.close();//avoid some problems we working the projects in the company
	}
}
//nextFloat(),nextByte()