package JavaCampDay3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1, "Ali", "Balcı");
		Instructer instructer = new Instructer(3500, 2, "Salih", "Babur");
		Student student = new Student("123456789", 3,"züleyha", "inal");
		
		PersonManager personManager = new PersonManager();
		personManager.add(user);
		personManager.delete(instructer);
		personManager.update(student);
		
		InstructerManager instructerManager = new InstructerManager();
		instructerManager.paySalary(instructer);
	}

}
