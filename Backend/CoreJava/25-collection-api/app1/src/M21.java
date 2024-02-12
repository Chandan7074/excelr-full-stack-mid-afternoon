import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
class M21 
{
	@SuppressWarnings({"removal", "unchecked"})
	public static void main(String[] args) 
	{
		Integer[] array = {new Integer(10), new Integer(4), new Integer(1), new Integer(0), new Integer(30), new Integer(2)};

		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("\n -----------------------");

		int counter = 1;
		for (int i = 0; i < array.length; i++)
		{
			if (counter != array.length)
			{
				System.out.print(array[i] + ", ");
			}
			else if(counter == array.length)
			{
				System.out.print(array[i]);
			}
			counter++;
		}
		Comparator ctr = Collections.reverseOrder();
		Arrays.sort(array, ctr);
		System.out.println("\n final order: " + Arrays.toString(array));
	}
}
