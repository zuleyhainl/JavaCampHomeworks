package JCDay4HW3;

public class Gamer extends Entities{
	//private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String birthDate;

	
	

	public Gamer(int id, String firstName, String lastName, String nationalityId, String birthDate) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthDate = birthDate;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}






	
	
	
	
	

}
