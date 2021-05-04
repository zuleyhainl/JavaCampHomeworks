package JavaCampDay3;

public class InstructerManager extends PersonManager{
	
	public void paySalary(Instructer instructer)
	{
		System.out.printf("%s' nin maaşı ödendi",instructer.getFirstName());
	}

}
