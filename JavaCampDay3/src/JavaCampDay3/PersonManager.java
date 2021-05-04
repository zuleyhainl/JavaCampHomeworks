package JavaCampDay3;

public class PersonManager {
	
	public void add(Person person)
	{
		System.out.printf("%s sisteme eklendi",person.getFirstName());
		System.out.println();
	}
	
	public void delete(Person person)
	{
		System.out.printf("%s sistemden silindi",person.getFirstName());
		System.out.println();
	}
	
	public void update(Person person)
	{
		System.out.printf("%s sistemde güncellendi",person.getFirstName());
		System.out.println();
	}

}
