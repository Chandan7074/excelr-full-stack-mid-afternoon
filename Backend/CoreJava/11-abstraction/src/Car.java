abstract class CarDriver
{
	public void howToDriveACar()
	{
		System.out.println("I got License, and Know how to drive");
	}
	
	abstract void technicalDetails();
}





class  Car extends CarDriver
{
	void technicalDetails()
	{
		System.out.println("Technical Thing, Engine, TPMS, AORVMS, HillHoldAssist, ADAS");
	}
	public static void main(String[] args) 
	{
		Car safari = new Car();
		safari.howToDriveACar();
		safari.technicalDetails();
		System.out.println("done");
	}
}
