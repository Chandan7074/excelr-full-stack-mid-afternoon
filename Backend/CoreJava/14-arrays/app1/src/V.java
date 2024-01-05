public class V
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		int[] y = new int[20];
		x = y;//x is poiting y value
		System.out.println(x.length);//20
		System.out.println(y.length);//20
		y = x;
		System.out.println(y == x);
		System.out.println(x == y);

		System.out.println(x[19]);
		System.out.println(y[19]);//0 to 19 = 20 
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println("done");
	}
}
