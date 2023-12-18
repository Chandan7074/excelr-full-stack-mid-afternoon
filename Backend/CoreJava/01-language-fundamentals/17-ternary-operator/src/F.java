class F
{
	public static void main(String[] args) 
	{
		int firstNum = 100;
		int secondNum = 200;
		int thirdNum = 2;
		int min = firstNum > secondNum ? ((secondNum < thirdNum) ? secondNum : thirdNum) : secondNum;
		System.out.println("Minimum b/w" + firstNum + "and" + secondNum + "and" + thirdNum + "is" + min);
	}
}
