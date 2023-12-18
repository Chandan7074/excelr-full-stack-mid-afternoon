class Employee 
{
	String employeeName, companyName;
	int rollNum;
	int age;

	Employee(String employeeName, int rollNum, int age)
	{
		System.out.println(employeeName);
		System.out.println(rollNum);
		System.out.println(age);
		//this always refers to the current object
		//employeeName = employeeName;
		//rollNum = rollNum;
		//age = age;
	}

	{
		companyName = "IBM";
	}
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("jhon", 101, 32);
		System.out.println("----------");
		Employee emp2 = new Employee("dann", 102, 30);
		System.out.println("----------");
		Employee emp3 = new Employee("mhon", 103, 33);
		System.out.println("----------");
		Employee emp4 = new Employee("jann", 104, 35);
	}
}
