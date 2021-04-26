package Homework2;

public class Course {//property class
	int id;
	String name;
	String detail;
	String instructorName;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public Course() 
	{
		
	}
	public Course(int id, String name, String detail, String instructorName)
	{
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.instructorName= instructorName;
	}

}
