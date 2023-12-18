class  G
{
	static int count;

	{
		count += 1;//IIB exicuting when object is creating before it loading  
	}
	public static void main(String[] args) 
	{
		 G g1 = new G();
		 G g2 = new G();
		 G g3 = new G();
		 G g4 = new G();
		 G g5 = new G();
		System.out.println("Number of Objects created for G class: " + count);
	}
}
