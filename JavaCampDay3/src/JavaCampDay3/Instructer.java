package JavaCampDay3;

public class Instructer extends Person{

	private double salary;
	
	public Instructer(double salary, int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	  

}
